package com.epam.trainogram.service;

import java.util.ArrayList;
import java.util.List;

import com.epam.trainogram.domain.Comment;
import com.epam.trainogram.domain.Post;
import com.epam.trainogram.domain.User;

public class PostServiceImpl implements PostService {
  private PostDao postDao;

  @Override
  public List<Post> findAll() {
    return postDao.findAll();
  }

  @Override
  public List<Post> findAll(User user) {
    return postDao.findAll(user);
  }

  @Override
  public List<Post> findSuggestions(User user) {
    List<Post> suggestions = new ArrayList<>();

    List<Post> allPosts = findAll(user);
    for (Post post : allPosts) {
      List<Comment> comments = post.getComments();
      for (Comment comment : comments) {
        final List<Post> commentAuthorPosts = getCommentAuthorPosts(comment);
        suggestions.addAll(getTopPosts(commentAuthorPosts, 5));
      }
    }

    return suggestions;
  }

  private List<Post> getCommentAuthorPosts(Comment comment) {
    final User author = comment.getAuthor();
    return findAll(author);
  }

  private List<Post> getTopPosts(List<Post> posts, int number) {
    if (number > posts.size()) {
      number = posts.size();
    }
    return posts.subList(0, number);
  }
}

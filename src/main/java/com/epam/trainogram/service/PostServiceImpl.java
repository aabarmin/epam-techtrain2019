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
        User commentAuthor = comment.getAuthor();
        List<Post> commenterPosts = findAll(commentAuthor);
        int count = 0;
        for (Post commenterPost : commenterPosts) {
          if (count == 5) {
            break;
          }
          count++;
          suggestions.add(commenterPost);
        }
      }
    }

    return suggestions;
  }
}

package com.epam.trainogram.service.post;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.epam.trainogram.domain.Comment;
import com.epam.trainogram.domain.Post;
import com.epam.trainogram.domain.User;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
  private final PostDao postDao;

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
    return findAll(user).stream()
        .flatMap(this::findPostComments)
        .map(Comment::getAuthor)
        .flatMap(commentAuthor -> findTopPosts(commentAuthor, 5))
        .collect(Collectors.toList());
  }

  @Override
  public Post save(Post post) {
    return postDao.save(post);
  }

  @Override
  public List<Post> findSponsored(User sponsor) {
    return postDao.findSponsored(sponsor);
  }

  private Stream<Comment> findPostComments(Post post) {
    return post.getComments().stream();
  }

  private Stream<Post> findTopPosts(User author, int postsCount) {
    return findAll(author).stream()
        .limit(postsCount);
  }
}

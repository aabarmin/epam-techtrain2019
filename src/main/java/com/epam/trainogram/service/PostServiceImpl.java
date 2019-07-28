package com.epam.trainogram.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    return findAll(user).stream()
        .flatMap(post -> post.getComments().stream())
        .map(comment -> comment.getAuthor())
        .flatMap(commentAuthor -> findAll(commentAuthor).stream().limit(5))
        .collect(Collectors.toList());
  }
}

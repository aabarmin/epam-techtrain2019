package com.epam.trainogram.service;

import java.util.List;

import com.epam.trainogram.domain.Post;
import com.epam.trainogram.domain.User;

public interface PostService {
  List<Post> findAll();
  List<Post> getByUser(User user);
  List<Post> retrieveSuggestions(User user);
}

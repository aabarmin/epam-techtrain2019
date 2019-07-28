package com.epam.trainogram.service;

import java.util.List;

import com.epam.trainogram.domain.Post;
import com.epam.trainogram.domain.User;

public interface PostDao {
  List<Post> findAll();
  List<Post> findAll(User user);
}

package com.epam.trainogram.service.post;

import java.util.List;

import com.epam.trainogram.domain.Post;
import com.epam.trainogram.domain.User;

public interface PostService {
  List<Post> findAll();

  List<Post> findAll(User user);

  List<Post> findSuggestions(User user);

  Post save(Post post);
}

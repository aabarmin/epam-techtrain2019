package com.epam.trainogram.service.like;

import com.epam.trainogram.domain.Post;
import com.epam.trainogram.domain.User;

public interface LikeService {
  void likePost(Post post, User whoLikes);
}

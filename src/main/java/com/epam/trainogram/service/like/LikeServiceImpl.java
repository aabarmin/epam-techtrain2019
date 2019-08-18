package com.epam.trainogram.service.like;

import com.epam.trainogram.domain.Like;
import com.epam.trainogram.domain.Post;
import com.epam.trainogram.domain.User;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LikeServiceImpl implements LikeService {
  private final LikeDao likeDao;

  @Override
  public void likePost(Post post, User whoLikes) {
    likeDao.save(new Like(post, whoLikes));
  }
}

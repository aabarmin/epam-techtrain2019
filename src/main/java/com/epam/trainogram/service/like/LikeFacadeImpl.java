package com.epam.trainogram.service.like;

import com.epam.trainogram.domain.Post;
import com.epam.trainogram.domain.SponsoredPost;
import com.epam.trainogram.domain.User;
import com.epam.trainogram.domain.notification.NewLikeNotification;
import com.epam.trainogram.service.notification.NotificationService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LikeFacadeImpl implements LikeFacade {
  private final LikeService likeService;
  private final NotificationService notificationService;

  @Override
  public void likePost(Post post, User whoLikes) {
    likeService.likePost(post, whoLikes);
    notificationService.sendNotification(
        new NewLikeNotification(post.getAuthor(), whoLikes)
    );
    if (post instanceof SponsoredPost) {
      SponsoredPost sponsoredPost = SponsoredPost.class.cast(post);
      notificationService.sendNotification(
        new NewLikeNotification(sponsoredPost.getSponsor(), whoLikes)
      );
    }
  }
}

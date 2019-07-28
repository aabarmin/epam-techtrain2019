package com.epam.trainogram.service.friend;

import com.epam.trainogram.domain.User;
import com.epam.trainogram.domain.notification.NewFriendshipNotification;
import com.epam.trainogram.service.notification.NotificationService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FriendshipFacadeImpl implements FriendshipFacade {
  private final FriendshipService friendshipService;
  private final NotificationService notificationService;

  @Override
  public void addToFriends(User owner, User newFriend) {
    friendshipService.addToFriends(owner, newFriend);
    notificationService.sendNotification(
        new NewFriendshipNotification(owner, newFriend)
    );
  }
}

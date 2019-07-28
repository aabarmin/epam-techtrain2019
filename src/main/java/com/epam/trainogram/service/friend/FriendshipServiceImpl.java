package com.epam.trainogram.service.friend;

import com.epam.trainogram.domain.Friendship;
import com.epam.trainogram.domain.User;
import com.epam.trainogram.domain.notification.NewFriendshipNotification;
import com.epam.trainogram.service.notification.NotificationService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FriendshipServiceImpl implements FriendshipService {
  private final FriendshipDao friendshipDao;
  private final NotificationService notificationService;

  @Override
  public void addToFriends(User owner, User newFriend) {
    friendshipDao.save(new Friendship(owner, newFriend));
    friendshipDao.save(new Friendship(newFriend, owner));

    notificationService.sendNotification(
        new NewFriendshipNotification(owner, newFriend)
    );
  }
}

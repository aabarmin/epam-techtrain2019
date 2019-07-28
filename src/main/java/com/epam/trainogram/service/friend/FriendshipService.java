package com.epam.trainogram.service.friend;

import com.epam.trainogram.domain.User;

public interface FriendshipService {
  void addToFriends(User owner, User newFriend);
}

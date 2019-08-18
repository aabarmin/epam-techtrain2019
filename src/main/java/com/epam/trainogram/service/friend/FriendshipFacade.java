package com.epam.trainogram.service.friend;

import com.epam.trainogram.domain.User;

public interface FriendshipFacade {
  void addToFriends(User owner, User newFriend);
}

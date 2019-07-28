package com.epam.trainogram.service.friend;

import com.epam.trainogram.domain.Friendship;
import com.epam.trainogram.domain.User;

public interface FriendshipDao {
  Friendship save(Friendship friendship);
}

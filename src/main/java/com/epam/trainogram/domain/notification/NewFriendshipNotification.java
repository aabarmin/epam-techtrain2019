package com.epam.trainogram.domain.notification;

import com.epam.trainogram.domain.User;
import lombok.Data;

@Data
public class NewFriendshipNotification implements Notification {
  private final User owner;
  private final User friend;
}

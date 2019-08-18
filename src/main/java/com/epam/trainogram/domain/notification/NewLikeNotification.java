package com.epam.trainogram.domain.notification;

import com.epam.trainogram.domain.User;
import lombok.Data;

@Data
public class NewLikeNotification implements Notification {
  private final User notificationReceiver;
  private final User whoLikes;
}

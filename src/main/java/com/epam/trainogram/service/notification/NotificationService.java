package com.epam.trainogram.service.notification;

import com.epam.trainogram.domain.notification.Notification;

public interface NotificationService {
  void sendNotification(Notification notification);
}

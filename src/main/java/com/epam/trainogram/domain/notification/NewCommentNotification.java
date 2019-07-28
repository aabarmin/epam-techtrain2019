package com.epam.trainogram.domain.notification;

import com.epam.trainogram.domain.Comment;
import com.epam.trainogram.domain.Post;
import lombok.Data;

@Data
public class NewCommentNotification implements Notification {
  private final Post post;
  private final Comment comment;
}

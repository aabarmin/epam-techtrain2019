package com.epam.trainogram.service;

import com.epam.trainogram.domain.Comment;
import com.epam.trainogram.domain.Post;
import lombok.Data;

@Data
public class NewCommentNotification implements Notification {
  private final Post post;
  private final Comment comment;
}

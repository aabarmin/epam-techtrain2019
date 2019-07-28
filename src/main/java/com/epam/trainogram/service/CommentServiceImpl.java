package com.epam.trainogram.service;

import com.epam.trainogram.domain.Comment;
import com.epam.trainogram.domain.Post;

public class CommentServiceImpl implements CommentService {
  private NotificationService notificationService;

  @Override
  public void addComment(Post post, Comment comment) {
    post.addComment(comment);
    notificationService.sendNotification(
        new NewCommentNotification(post, comment)
    );
  }
}

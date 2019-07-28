package com.epam.trainogram.service;

import com.epam.trainogram.domain.Comment;
import com.epam.trainogram.domain.Post;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommentsFacadeImpl implements CommentsFacade {
  private final CommentService commentService;
  private final NotificationService notificationService;

  @Override
  public void addComment(Post post, Comment comment) {
    commentService.addComment(post, comment);
    notificationService.sendNotification(
        new NewCommentNotification(post, comment)
    );
  }
}

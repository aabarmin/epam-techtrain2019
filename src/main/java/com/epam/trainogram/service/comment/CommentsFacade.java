package com.epam.trainogram.service.comment;

import com.epam.trainogram.domain.Comment;
import com.epam.trainogram.domain.Post;

public interface CommentsFacade {
  void addComment(Post post, Comment comment);
}

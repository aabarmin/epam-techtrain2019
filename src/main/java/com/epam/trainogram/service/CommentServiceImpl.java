package com.epam.trainogram.service;

import com.epam.trainogram.domain.Comment;
import com.epam.trainogram.domain.Post;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
  @Override
  public void addComment(Post post, Comment comment) {
    post.addComment(comment);
  }
}

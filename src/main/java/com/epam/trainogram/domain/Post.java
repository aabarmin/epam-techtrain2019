package com.epam.trainogram.domain;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Post {
  private Picture picture;
  private User author;
  private int likesCount;
  private LocalDate publicationDate;
  private List<Comment> comments;

  public void addComment(Comment comment) {
    comments.add(comment);
  }
}

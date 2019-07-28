package com.epam.trainogram.domain;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class Post implements HasLikeNotificationRecipiends {
  private Picture picture;
  private User author;
  private int likesCount;
  private LocalDate publicationDate;
  private List<Comment> comments;

  public void addComment(Comment comment) {
    comments.add(comment);
  }

  @Override
  public List<User> getLikeNotificationRecipients() {
    return Arrays.asList(author);
  }
}

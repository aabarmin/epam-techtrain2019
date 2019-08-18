package com.epam.trainogram.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Comment {
  private User author;
  private String text;
  private LocalDate publicationDate;
}

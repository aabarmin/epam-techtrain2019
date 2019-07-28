package com.epam.trainogram.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Comment {
  private User who;
  private String text;
  private LocalDate pubD;
}

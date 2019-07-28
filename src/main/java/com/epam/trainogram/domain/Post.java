package com.epam.trainogram.domain;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Post {
  private Picture pic;
  private User who;
  private int likes;
  private LocalDate pubT;
  private List<Comment> cmts;
}

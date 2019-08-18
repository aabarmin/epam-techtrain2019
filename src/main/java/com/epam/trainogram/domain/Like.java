package com.epam.trainogram.domain;

import lombok.Data;

@Data
public class Like {
  private final Post post;
  private final User whoLikes;
}

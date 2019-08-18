package com.epam.trainogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Friendship {
  private final User owner;
  private final User friend;
}

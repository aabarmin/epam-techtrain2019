package com.epam.trainogram.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Picture {
  private byte[] imageContent;
  private LocalDate creationDate;
}

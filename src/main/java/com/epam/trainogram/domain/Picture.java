package com.epam.trainogram.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Picture {
  private byte[] img;
  private LocalDate crtDate;
}

package com.epam.trainogram.domain;

import lombok.Data;

@Data
public class ReportLine {
  private final Post post;
  private final int likesCount;
}

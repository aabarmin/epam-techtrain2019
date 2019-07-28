package com.epam.trainogram.domain;

import java.util.List;

import lombok.Data;

@Data
public class Report {
  private final List<ReportLine> lines;
}

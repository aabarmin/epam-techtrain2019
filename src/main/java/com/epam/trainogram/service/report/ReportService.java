package com.epam.trainogram.service.report;

import com.epam.trainogram.domain.Report;
import com.epam.trainogram.domain.User;

public interface ReportService {
  Report buildReport(User user);

  Report buildSponsoredReport(User user);
}

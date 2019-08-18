package com.epam.trainogram.service.upload;

import java.util.List;

import com.epam.trainogram.domain.Picture;

public interface PreparationService {
  Picture prepare(Picture source, List<Filter> filters);
}

package com.epam.trainogram.service.upload;

import java.util.List;

import com.epam.trainogram.domain.Picture;

public class PreparationServiceImpl implements PreparationService {
  @Override
  public Picture prepare(Picture source, List<Filter> filters) {
    Picture prepared = source;
    for (Filter filter : filters) {
      prepared = filter.apply(prepared);
    }
    return prepared;
  }
}

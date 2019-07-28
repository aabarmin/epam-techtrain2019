package com.epam.trainogram.service.upload;

import com.epam.trainogram.domain.Picture;

public interface Filter {
  Picture apply(Picture source);
}

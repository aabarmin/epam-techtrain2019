package com.epam.trainogram.service.upload;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import com.epam.trainogram.domain.Picture;
import org.junit.jupiter.api.Test;

class PreparationServiceImplTest {
  private PreparationService preparationService = new PreparationServiceImpl();

  @Test
  void prepare_withFilters() {
    Picture picture = new Picture();

    Picture prepared = preparationService.prepare(picture, Arrays.asList(

    ));
  }
}

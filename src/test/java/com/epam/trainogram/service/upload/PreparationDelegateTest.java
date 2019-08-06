package com.epam.trainogram.service.upload;

import java.util.Arrays;
import java.util.List;

import com.epam.trainogram.domain.Picture;
import com.epam.trainogram.domain.User;
import com.epam.trainogram.service.upload.filter.ClarendonFilter;
import com.epam.trainogram.service.upload.filter.MoonFilter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PreparationDelegateTest {
  @Mock
  private Picture picture;
  @Mock
  private User user;
  @Mock
  private PublishingServiceImpl publishingService;
  @Mock
  private PreparationServiceImpl preparationService;

  @Test
  void runPreparation(User user, Picture picture) {
    List<Filter> filters = Arrays.asList(
        new ClarendonFilter(),
        new MoonFilter()
    );
    Picture preparedPicture = preparationService.prepare(picture, filters);
    publishingService.publishPost(user, preparedPicture);
  }
}

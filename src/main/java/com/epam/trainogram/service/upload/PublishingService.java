package com.epam.trainogram.service.upload;

import com.epam.trainogram.domain.Picture;
import com.epam.trainogram.domain.Post;
import com.epam.trainogram.domain.User;

public interface PublishingService {
  Post publishPost(User author, Picture picture);
}

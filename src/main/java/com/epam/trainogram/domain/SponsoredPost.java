package com.epam.trainogram.domain;

import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class SponsoredPost extends Post {
  private User sponsor;

  @Override
  public List<User> getLikeNotificationRecipients() {
    return Arrays.asList(
        getAuthor(),
        getSponsor()
    );
  }
}

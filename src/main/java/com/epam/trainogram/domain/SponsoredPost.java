package com.epam.trainogram.domain;

import lombok.Data;

@Data
public class SponsoredPost extends Post {
  private User sponsor;
}

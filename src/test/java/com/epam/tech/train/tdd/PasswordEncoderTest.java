package com.epam.tech.train.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordEncoderTest {
  @Test
  void encode_shouldEncode() {
    PasswordEncoder encoder = new PasswordEncoder();
    String encodedPassword = encoder.encode("password");
    assertEquals("drowssap", encodedPassword);
  }
}

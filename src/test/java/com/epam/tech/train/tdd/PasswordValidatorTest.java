package com.epam.tech.train.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {
  @Test
  void isValid_shouldBeValid() {
    PasswordValidator unitUnderTest = new PasswordValidator();

    boolean result = unitUnderTest.isValid("VALID");

    assertTrue(result);
  }

  @Test
  @Disabled
  void isValid_shouldBeInvalid() {
    PasswordValidator unitUnderTest = new PasswordValidator();

    boolean result = unitUnderTest.isValid("INV");

    assertTrue(result);
  }
}

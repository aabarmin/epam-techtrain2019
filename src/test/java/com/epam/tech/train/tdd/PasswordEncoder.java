package com.epam.tech.train.tdd;

public class PasswordEncoder {
  public String encode(String password) {
    return new StringBuilder(password)
        .reverse()
        .toString();
  }
}

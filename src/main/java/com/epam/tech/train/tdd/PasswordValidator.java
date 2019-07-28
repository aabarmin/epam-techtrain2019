package com.epam.tech.train.tdd;

public class PasswordValidator {
  public boolean isValid(String password) {
    if (password.equals("VALID")) {
      return true;
    }
    return false;
  }

  public static void main(String args[]) {
    boolean valid = new PasswordValidator().isValid("VALID");
    System.out.println(valid);
  }
}

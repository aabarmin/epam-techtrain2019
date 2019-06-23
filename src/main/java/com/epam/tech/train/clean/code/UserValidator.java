package com.epam.tech.train.clean.code;

public class UserValidator {
  private UserService userService;
  private PasswordValidator passwordValidator;
  private SessionService sessionService;

  public boolean checkPassword(String username, String password) {
    User user = userService.findUserByName(username);
    if (user != null) {
      if (passwordValidator.isValid(password, user.getEncryptedPassword())) {
        sessionService.initializeSession(user);
        return true;
      }
    }
    return false;
  }

  public void authorize(String username, String password) {
    if (checkPassword(username, password)) {
      initializeSession(username, password);
    }
  }

  private void initializeSession(String username, String password) {

  }
}

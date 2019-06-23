package com.epam.tech.train.clean.code;

import java.util.Collections;
import java.util.List;

public class BadExample {
  public void badNaming() {
    int x;
    String n;
  }

  public List<String> getNames() {
    return Collections.emptyList();
  }

  public void setValues(List<String> values) {

  }

  public int doSomething() {
    return 0;
  }
}

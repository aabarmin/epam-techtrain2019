package com.epam.tech.train.clean.code;

import java.util.List;

public interface MethodNaming {
  Person getPerson(int id);

  Person findPersonByName(String name);

  List<Person> retrieveAll();
}

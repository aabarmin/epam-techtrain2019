package com.epam.tech.train.solid.lsp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {
  @Test
  void check_rectangle() {
    Rectangle rectangle = new Rectangle();
    rectangle.setHeight(10);
    rectangle.setWidth(20);
    assertEquals(200, rectangle.getHeight() * rectangle.getWidth());
  }

  @Test
  void check_square() {
    Rectangle rectangle = new Square();
    rectangle.setHeight(10);
    rectangle.setWidth(20);
    assertEquals(200, rectangle.getHeight() * rectangle.getWidth());
  }
}

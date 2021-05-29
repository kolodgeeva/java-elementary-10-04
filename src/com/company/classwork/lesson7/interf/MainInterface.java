package com.company.classwork.lesson7.interf;

import java.util.List;

public class MainInterface {

  public static void main(String[] args) {

    Drawable something = new Triangle(3, 3, 3);
    Drawable anotherSomething = new Square(10);
    Drawable wtf = new Flower();

    List<Drawable> elements = List.of(something, anotherSomething, wtf);
    drawAll(elements);

  }

  public static void drawAll(List<Drawable> drawables) {
    for (Drawable drawable: drawables) {
      drawable.draw();
    }
  }

}

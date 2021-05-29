package com.company.classwork.lesson7.interf;

public class Square extends Shape {

  double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public void draw() {
    System.out.println("draw square");
  }

  @Override
  public double calculatePerimeter() {
    return side * 4;
  }
}

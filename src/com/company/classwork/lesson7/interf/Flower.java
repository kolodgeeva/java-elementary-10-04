package com.company.classwork.lesson7.interf;

public class Flower implements Drawable, Smellable {

  @Override
  public void draw() {
    System.out.println("draw flower");
  }

  @Override
  public void smell() {
    System.out.println("What a nice smell!");
  }
}

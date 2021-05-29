package com.company.classwork.lesson7;

public abstract class ChessItem {

  private int x;
  private int y;
  private int value;

  public int getValue() {
    return value;
  }

  public abstract void draw();

}

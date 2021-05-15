package com.company.classwork.lesson5;

public class Bicycle {

  private static int BICYCLE_COUNT;
  private String model;

  public Bicycle(String model) {
    this.model = model;
    BICYCLE_COUNT++;
  }

  public void ride() {
    System.out.println("ride bicycle " + model);
    //Seat seat = this.new Seat(); can do it
  }

  public static int bicycleCount() {
    return BICYCLE_COUNT;
    //Seat seat = new Seat(); cannot do it
  }

  public class SteeringWheel {

    public void left() {
      System.out.println("turn to left " + model);
    }

    public void right() {
      System.out.println("turn to right " + model);
    }

  }

  public class Seat {

    public void up() {
      System.out.println("seat up " + model);
    }

    public void down() {
      System.out.println("seat down " + model);
    }

  }

}

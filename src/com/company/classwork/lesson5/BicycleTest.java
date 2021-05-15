package com.company.classwork.lesson5;

public class BicycleTest {

  public static void main(String[] args) {

    Bicycle bicycle = new Bicycle("Model S");
    bicycle.ride();

    Bicycle.Seat seat = bicycle.new Seat();
    seat.up();
    seat.down();

    Bicycle.SteeringWheel steeringWheel = bicycle.new SteeringWheel();
    steeringWheel.left();
    steeringWheel.right();

    System.out.println(Bicycle.bicycleCount());

  }

}

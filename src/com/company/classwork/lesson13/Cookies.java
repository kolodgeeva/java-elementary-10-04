package com.company.classwork.lesson13;

@ControlledObject(name = "biscuits")
public class Cookies {

  @StartObject
  public void startBaking() {
    System.out.println("start baking");
  }

  @StopObject
  public void stopBaking() {
    System.out.println("stop baking");
  }

}

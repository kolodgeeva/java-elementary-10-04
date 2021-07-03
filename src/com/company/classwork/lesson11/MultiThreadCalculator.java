package com.company.classwork.lesson11;

public class MultiThreadCalculator {

  public static int RESULT;

  public static void main(String[] args) {

    Thread adder = new Adder();
    Thread result = new Result();

    adder.start();
    result.start();

    result.stop();

  }

  public static class Adder extends Thread {

    @Override
    public void run() {

      int x = 2;
      int y = 3;

      try {
        System.out.println("Adder is going to sleep");
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      RESULT = x + y;

    }
  }

  public static class Result extends Thread {

    @Override
    public void run() {

      while (true) {
        if (RESULT != 0) {
          System.out.println("result: " + RESULT);
          return;
        }

        try {
          System.out.println("Result is going to sleep");
          Thread.sleep(500);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

      }
    }
  }


}

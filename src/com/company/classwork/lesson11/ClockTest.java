package com.company.classwork.lesson11;

public class ClockTest {

  public static void main(String[] args) throws InterruptedException {

    Clock clock = new Clock();
    Thread thread = new Thread(clock);
    thread.start();

    Thread.sleep(5000);
    thread.interrupt();

  }

  public static class Clock implements Runnable {

    @Override
    public void run() {
      while (!Thread.currentThread().isInterrupted()) {
        System.out.println("Tik");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          System.out.println(e.getMessage());
          return;
        }
      }
    }
  }

}

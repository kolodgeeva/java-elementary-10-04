package com.company.classwork.lesson11;

public class ThreadTest {

  public static void main(String[] args) throws InterruptedException {

    Thread thread = new PrinterThread();
    thread.start();



    System.out.println("main thread start");
    System.out.println("main thread is working");
    System.out.println("main thread stop");

    thread.join();

    System.out.println("after join");

  }

  public static class PrinterThread extends Thread {

    @Override
    public void run() {
      System.out.println("PrinterThread thread start");
      System.out.println("PrinterThread thread is working");
      System.out.println("PrinterThread thread stop");
    }
  }

}

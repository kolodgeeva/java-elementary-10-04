package com.company.classwork.lesson11;

public class RunnableTest {

  public static void main(String[] args) {

    Runnable printer = new Printer("Oleg");
    Thread thread = new Thread(printer);

    Runnable printer1 = new Printer("Ivan");
    Thread thread1 = new Thread(printer1);

    Thread thread2 = new Thread(printer);
    Thread thread3 = new Thread(printer);

    thread.start();
    thread1.start();
    thread2.start();
    thread3.start();

    System.out.println("main thread start");
    System.out.println("main thread is working");
    System.out.println("main thread stop");

  }

  public static class Printer implements Runnable {

    private String name;

    public Printer(String name) {
      this.name = name;
    }

    @Override
    public void run() {
      System.out.println(name + " thread start");
      System.out.println(name + " thread is working");
      System.out.println(name + " thread stop");
    }
  }


}

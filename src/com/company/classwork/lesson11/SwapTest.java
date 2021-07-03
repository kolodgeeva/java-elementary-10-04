package com.company.classwork.lesson11;

import java.util.concurrent.atomic.AtomicInteger;

public class SwapTest {

  public static final Swapper SWAPPER = new Swapper();

  public static void main(String[] args) throws InterruptedException {

    System.out.println(SWAPPER);

    Thread swapper1 = new SwapperThread();
    Thread swapper2 = new SwapperThread();

    swapper1.start();
    swapper2.start();

    swapper1.join();
    swapper2.join();

    System.out.println(SWAPPER);

  }

  public static class SwapperThread extends Thread {

    @Override
    public void run() {
      SWAPPER.swap();
    }
  }

  public static class Swapper {

    String name1 = "Лена";
    String name2 = "Оля";

    public synchronized void swap() {
      String temp = name1;
      name1 = name2;
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      name2 = temp;
    }

    @Override
    public String toString() {
      return "Swap{" +
          "name1='" + name1 + '\'' +
          ", name2='" + name2 + '\'' +
          '}';
    }
  }

}

package com.company.classwork.lesson12;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaTest {

  public static void main(String[] args) {

    new Thread(() -> System.out.println("Hello world")).start();

    Runnable runnable = () -> {
      System.out.println("Hello world 1");
      System.out.println("Hello world 2");
    };

    new Thread(runnable).start();

    final AtomicInteger count = new AtomicInteger(0);

    Runnable runnable1 = new Runnable() {
      @Override
      public void run() {
        count.getAndIncrement();
      }
    };

    Runnable runnable2 = () -> count.getAndIncrement();
    Runnable runnable3 = count::getAndIncrement;

    //Supplier<Person> personSupplier = () -> new Person();
    Supplier<Person> personSupplier = Person::new;

  }

}

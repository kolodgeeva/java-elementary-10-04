package com.company.classwork.lesson12;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceTest {

  public static void main(String[] args) {
    runFunction(x -> ++x);

    UnaryOperator<Integer> unaryOperator = x -> x + 1;
    System.out.println("UnaryOperator:");
    System.out.println(unaryOperator.apply(100));

    //Consumer<Integer> consumer = x -> System.out.println(x);
    Consumer<Integer> consumer = System.out::println;
    System.out.println("Consumer:");
    consumer.accept(10);

    Supplier<Integer> supplier = () -> 200;
    System.out.println("Supplier:");
    System.out.println(supplier.get());

    Predicate<Integer> predicate = x -> x > 0;
    System.out.println("Predicate:");
    System.out.println(predicate.test(-200));
    System.out.println(predicate.test(200));

    SuperPredicate superPredicate = string -> string.equals("stop");
    System.out.println("Super Predicate:");
    System.out.println(superPredicate.myTest("stop"));
    System.out.println(superPredicate.myTest("text"));

  }

  public static void runFunction(Function<Integer, Integer> function) {
    System.out.println("Function:");
    Integer result = function.apply(10);
    System.out.println(result);
  }

}

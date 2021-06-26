package com.company.classwork.lesson10;

public class StackTraceTest {

  public static boolean isException = true;

  public static void main(String[] args) {
    System.out.println("main: before call method1");
    method1();
    System.out.println("main: after call method1");
  }

  public static void method1() {
    System.out.println("method1: before call method2");
    method2();
    System.out.println("method1: after call method2");
  }

  public static void method2() {
    System.out.println("method2: before call method3");

    try {
      System.out.println("start try");
      method3();
      System.out.println("end try");
    } catch (HillelException exception) {
      System.out.println("method3 throws exception, but program will continue work. "
          + exception.getMessage());
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    } finally {
      System.out.println("finally");
    }

    System.out.println("method2: before call method3");
  }

  public static void method3() {
    System.out.println("method3: before call method4");
    if (isException) {
      throw new HillelException("My Exception");
    }
    method4();
    System.out.println("method3: after call method4");
  }

  public static void method4() {
    System.out.println("method4");
    throw new RuntimeException("RuntimeException");
  }
}

package com.company.classwork.lesson13;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Bakery {

  public static void main(String[] args)
      throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {

    Cookies cookies = new Cookies();

    //cookies.startBaking();
    //cookies.stopBaking();

    Class cl = cookies.getClass();
    //Class cl1 = Class.forName("com.company.classwork.lesson13.Cookies");

    if (cl.isAnnotationPresent(ControlledObject.class)) {
      System.out.println("Object has ControlledObject annotation");

      Annotation annotation = cl.getAnnotation(ControlledObject.class);

      System.out.println(annotation);

      Method[] methods = cl.getMethods();

      for (Method method: methods) {
        System.out.println(method.getName());

        if (method.isAnnotationPresent(StartObject.class)) {
          System.out.println("We can start operations");
          method.invoke(cookies);
        } else if (method.isAnnotationPresent(StopObject.class)) {
          System.out.println("We can stop operations");
          method.invoke(cookies);
        }

      }

    } else {
      System.out.println("Nothing to do");
    }

  }

}

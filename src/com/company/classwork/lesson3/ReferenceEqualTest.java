package com.company.classwork.lesson3;

public class ReferenceEqualTest {

  public static void main(String[] args) {

    Dog dog1 = new Dog();
    Dog dog2 = new Dog("Lusy");

    System.out.println(dog1);
    System.out.println(dog2);
    System.out.println("compare by reference: " + (dog1 == dog2));
    System.out.println("compare by value: " + dog1.equals(dog2));

    //dog2.name = "Lusy";
    dog2.age = 10;

    System.out.println("compare by value: " + dog1.equals(dog2));

    Dog dog3 = dog1;
    System.out.println("compare by reference: " + (dog1 == dog3));
    

    /*String test = "test";
    String test2 = "test2";
    System.out.println(test.equals(test2));*/


  }

}

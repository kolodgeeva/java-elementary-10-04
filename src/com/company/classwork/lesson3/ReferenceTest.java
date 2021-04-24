package com.company.classwork.lesson3;

public class ReferenceTest {

  public static void main(String[] args) {

    Dog dog1 = new Dog();
    System.out.println(dog1);
    changeDog(dog1, "dog1 name");
    dog1.printInfo();

    Dog dog2 = new Dog();
    System.out.println(dog2);
    changeDog(dog2, "dog2 name");
    dog2.printInfo();

    Dog dog3 = dog1;
    System.out.println(dog3);
    changeDog(dog3, "dog3 name");
    dog3.printInfo();

    dog1.printInfo();


  }

  static void changeDog(Dog dog, String name) {

    //dog.name = name;

  }

}

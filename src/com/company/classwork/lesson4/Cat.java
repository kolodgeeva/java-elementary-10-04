package com.company.classwork.lesson4;

public class Cat {

  static final String DEFAULT_NAME = "Default cat";
  static final int DEFAULT_AGE = 1;
  static final String DEFAULT_COLOR = "No color";

  static int COUNT;

  String name;
  int age;
  String color;

  public Cat() {
//    this.name = "Default cat";
//    this.age = 1;
//    this.color = "No color";
    this(DEFAULT_NAME, DEFAULT_AGE, DEFAULT_COLOR);
    System.out.println("Cat is created");
  }

  public Cat(String name, int age, String color) {
    //this.name = name;
    //this.color = color;
    this(name, color);
    this.age = age;
  }

  public Cat(String name, String color) {
    //this.name = name;
    this(name);
    this.color = color;
  }

  public Cat(String name, int age) {
    //this.name = name;
    this(name);
    this.age = age;
  }

  public Cat(String name) {
    this.name = name;
  }

  public String toString() {
    return "Cat: " + this.name + ", " + this.age + ", " + this.color;
  }

  public boolean equals(Object object) {

    if (object instanceof Cat) {
      Cat cat = (Cat) object;

      if (this == cat) {
        return true;
      }

      return this.name.equals(cat.name)
          && this.age == cat.age
          && this.color.equals(cat.color);
    }
    return false;
  }

  public void speak() {
    System.out.println("mauuu");
    // incrementCatCount(); // - can do this
  }

  static void incrementCatCount() {
    COUNT++;
    // Cat.speak(); // - cannot do this
  }

}

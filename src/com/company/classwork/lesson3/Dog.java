package com.company.classwork.lesson3;

public class Dog {

  private String name;
  String breed;
  float length;
  int age;
  String color;

  public Dog() {
    this.name = "Default name";
  }

  public Dog(String name) {
    this.name = name;
  }

  void eat() {
    System.out.println("dog eats");
  }

  void sleep() {
    System.out.println("dog sleep");
  }

  Stick giveStick() {
    Stick stick = new Stick();
    stick.name = "my beautiful stick";
    stick.length = 10;
    return stick;
  }

  void printInfo() {
    System.out.println("-----------------------");
    System.out.println("Dog name: " + this.name);
    System.out.println("Dog age: " + this.age);
    System.out.println("Dog color: " + this.color);
    System.out.println("Dog length: " + this.length);
    System.out.println("Dog breed: " + this.breed);
  }

  public boolean equals(Object object) {

    if (object instanceof Dog) {
      Dog dog = (Dog) object;
      return this.age == dog.age;
    }
    return false;

  }

  public String toString() {
    return "Dog " + this.name + ", age " + this.age + ", reference " + super.toString();
  }

}

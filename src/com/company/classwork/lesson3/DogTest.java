package com.company.classwork.lesson3;

public class DogTest {

  public static void main(String[] args) {

    Dog bobby = new Dog("Bobby");
    //bobby.name = "Bobby";
    bobby.age = 3;
    bobby.color = "white";

    bobby.eat();
    bobby.sleep();
    bobby.printInfo();

    Dog sharik = new Dog("Sharik");
    //sharik.name = "Sharik";
    sharik.length = 45.7F;
    sharik.breed = "maltese";

    sharik.printInfo();
    Stick stick = sharik.giveStick();
    //System.out.println(sharik.name + " brought me " + stick.name + " with length " + stick.length);

  }

}

package com.company.classwork.lesson4;

public class CatTest {

  public static void main(String[] args) {

    System.out.println("If you want to create cat without parameters, it will have name "
        + Cat.DEFAULT_NAME
        + ", age " + Cat.DEFAULT_AGE
        + ", color " + Cat.DEFAULT_COLOR);

    Cat cat = new Cat();
    Cat.incrementCatCount();
    System.out.println(cat);

    cat.name = "Tom";
    cat.age = 3;
    cat.color = "Gray";
    System.out.println(cat);

    Cat cat1 = new Cat("John", 5, "black");
    Cat.incrementCatCount();
    System.out.println(cat1);

    System.out.println(cat.equals(cat1));
    System.out.println(cat.equals(cat));

    cat.speak();

    System.out.println("Cat count: " + Cat.COUNT);

  }

}

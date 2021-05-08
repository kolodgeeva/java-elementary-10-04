package com.company.classwork.lesson4;

public class PersonTest {

  public static void main(String[] args) {

    Person person = new Person("Mariana", "Ivanova", 17);
    System.out.println(person);

    if (person.getAge() >= 18) {
      System.out.println("Can buy alcohol");
    } else {
      System.out.println("Go away!");
    }

    person.setMoney(10000000);
    System.out.println(person);

    Person person1 = new Person("Anna", "Unknown", 30, 1000);
    System.out.println(person1);

    person.withdrawMoney(person1);

    System.out.println("After withdraw");

    System.out.println(person);
    System.out.println(person1);

  }

}

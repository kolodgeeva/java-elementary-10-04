package com.company.classwork.lesson6;

import com.company.classwork.lesson6.animal.Animal;
import com.company.classwork.lesson6.animal.Penguin;
import com.company.classwork.lesson6.animal.Rat;
import com.company.classwork.lesson6.animal.Tiger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimalTest {

  public static void main(String[] args) throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    while (true) {

      System.out.println("Input animal type (rat, tiger, penguin) or 'stop' to exit:");
      String animalType = bufferedReader.readLine();

      if ("stop".equals(animalType)) {
        break;
      }

      System.out.println("Input animal name:");
      String name = bufferedReader.readLine();

      switch (animalType.toUpperCase().trim()) {
        case "RAT":
          handleAnimal(new Rat(name));
          break;
        case "TIGER":

          System.out.println("Input tiger age:");
          int age = Integer.parseInt(bufferedReader.readLine());

          handleAnimal(new Tiger(name, age));
          break;
        case "PENGUIN":
          handleAnimal(new Penguin(name));
          break;
        default:
          System.out.println("unknown animal type");
      }
    }

    System.out.println("Created " + Animal.getAnimalCount() + " animals");

  }

  public static void handleAnimal(Animal animal) {

    System.out.println(animal.getName());

    animal.eat("some food");
    animal.speak();

    System.out.println("Is animal: " + (animal instanceof Animal));
    System.out.println("Is rat: " + (animal instanceof Rat));
    System.out.println("Is tiger: " + (animal instanceof Tiger));
    System.out.println("Is penguin: " + (animal instanceof Penguin));

    if (animal instanceof Penguin) {
      Penguin penguin = (Penguin) animal;
      penguin.swim();
    }

  }

}

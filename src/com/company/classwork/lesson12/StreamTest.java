package com.company.classwork.lesson12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

  public static void main(String[] args) {

    List<String> strings = new ArrayList<>();
    strings.add("One");
    strings.add("Two");
    strings.add("Three");
    strings.add("Four");
    strings.add("Five");
    strings.add("Six");
    strings.add("Seven");
    strings.add("Eight");
    strings.add("Nine");
    strings.add("Ten");

    strings.forEach(System.out::println);

    System.out.println();


    for (String string: strings) {
      if (string.length() < 4) {
        System.out.println(string);
      }
    }

    System.out.println();

    strings.stream()
        .filter(string -> string.length() < 4)
        .map(s -> s + ", hello!")
        //.map(s -> s.length())
        .forEach(System.out::println);

    System.out.println();

    strings.stream()
        .map(Person::new)
        .limit(5)
        .sorted((Comparator.comparingInt(o -> o.getName().length())))
        .forEach(System.out::println);

    System.out.println();

    long count = strings.stream()
        .filter(s -> s.length() > 4)
        .count();

    System.out.println(count);


    List<Person> newStrings = strings.stream()
        .filter(s -> s.length() > 4)
        .map(Person::new)
        .collect(Collectors.toList());

    Optional<String> newString = strings.stream()
        .filter(s -> s.length() > 10)
        .findFirst();

    System.out.println(newString.orElse("Not found"));


  }

}

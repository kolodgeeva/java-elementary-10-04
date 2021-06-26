package com.company.classwork.lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesTest {

  public static void main(String[] args) throws FileNotFoundException {
    try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
      String line = reader.readLine();
      System.out.println("First line from file: " + line);
    } catch (IOException exception) {
      System.out.println(exception.getMessage());
    }
  }
}

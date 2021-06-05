package com.company.classwork.lesson8;

import java.util.ArrayList;
import java.util.Iterator;

public class UserTest {

  public static void main(String[] args) {

    ArrayList<User> users = new ArrayList<>();

    fillTheList(users);
    printUsers(users);

    String name = getName();

    removeUserByName3(users, name);
    printUsers(users);

  }

  private static void removeUserByName(ArrayList<User> users, String name) {
    for (int i = 0; i < users.size(); i++) {
      User user = users.get(i);
      if (user.getName().equals(name)) {
        users.remove(i);
      }
    }
  }

  private static void removeUserByName2(ArrayList<User> users, String name) {
    for (User user: users) {
      if (user.getName().equals(name)) {
        users.remove(user);
      }
    }
  }

  private static void removeUserByName3(ArrayList<User> users, String name) {
    Iterator<User> iterator = users.iterator();
    while (iterator.hasNext()) {
      User user = iterator.next();
      if (user.getName().equals(name)) {
        iterator.remove();
      }
    }
  }

  private static void removeUserByName4(ArrayList<User> users, String name) {
    users.removeIf(user -> user.getName().equals(name));
  }

  private static void printUsers(ArrayList<User> users) {
    for (User user: users) {
      System.out.println(user);
    }
    System.out.println();
  }

  private static String getName() {
    return "Вася";
  }

  private static void fillTheList(ArrayList<User> users) {
    users.add(new User("Коля", 20));
    users.add(new User("Витя", 20));
    users.add(new User("Вася", 20));
    users.add(new User("Наташа", 20));
    users.add(new User("Олег", 20));
  }

}

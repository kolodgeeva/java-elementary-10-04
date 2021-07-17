package com.company.classwork.lesson13;

import java.util.Optional;

public class NPETest {

  public static void main(String[] args) {

    Employee employee = getEmployee();

    //System.out.println(employee.getName());

    Optional<Employee> employee1 = getOptionalEmployee();

    System.out.println("isPresent: " + employee1.isPresent());
    System.out.println("isEmpty: " + employee1.isEmpty());

    employee1.ifPresent(System.out::println);

  }

  public static Employee getEmployee() {
    return null;
  }

  public static Optional<Employee> getOptionalEmployee() {

    //return Optional.empty();
    return Optional.of(new Employee(EmployeeType.DIRECTOR, "David"));

  }

}

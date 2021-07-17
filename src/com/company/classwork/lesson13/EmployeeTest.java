package com.company.classwork.lesson13;

public class EmployeeTest {

  public static void main(String[] args) {

    Employee employee = new Employee(EmployeeType.DEVELOPER, "Nikita");
    Employee employee1 = new Employee(EmployeeType.DIRECTOR, "Anna");

    System.out.println(employee + " get salary " + employee.getType().getSalary());

    System.out.println(employee1 + " get salary " + employee1.getType().getSalary());

  }

}

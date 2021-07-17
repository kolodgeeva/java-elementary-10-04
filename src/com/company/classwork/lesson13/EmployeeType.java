package com.company.classwork.lesson13;

public enum EmployeeType {

  DIRECTOR(5000),
  ACCOUNTANT(1000),
  CLEANER(500),
  SECURITY(500),
  DEVELOPER(3000),
  DESIGNER(1500);

  private int salary;

  EmployeeType(int salary) {
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }
}

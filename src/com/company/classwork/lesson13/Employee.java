package com.company.classwork.lesson13;

@Marker
//@EmployeeMarker
@EmployeeMarker(version = "2.0")
public class Employee {

  EmployeeType type;
  String name;

  public Employee(EmployeeType type, String name) {
    this.type = type;
    this.name = name;
  }

  public EmployeeType getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "type=" + type +
        ", name='" + name + '\'' +
        '}';
  }
}

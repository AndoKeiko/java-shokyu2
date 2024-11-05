package org.example;

public class Student {
String name;
int point;

  public Student(String name, int point) {
    this.name = name;
    this.point = point;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPoint() {
    return point;
  }

  public void setPoint(int point) {
    this.point = point;
  }

  @Override
  public String toString() {
    return name + " : " + point;
  }
}

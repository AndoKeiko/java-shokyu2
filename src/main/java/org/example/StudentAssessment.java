package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class StudentAssessment {
  private List<Student> students = new ArrayList<>();

  public StudentAssessment() {
    this.students = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void removeStudent(Student student) {
    students.remove(student);
  }







}

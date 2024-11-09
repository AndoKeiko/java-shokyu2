package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentAssessment {

  private static List<Student> students = new ArrayList<>();
  Scanner scanner = new Scanner(System.in);

  public void addStudent(Scanner scanner) {
    System.out.println("学生の名前を入力してください:");
    String name = scanner.next();
    scanner.nextLine();
    System.out.println(name + "の点数を入力してください:");
    int point = scanner.nextInt();
    scanner.nextLine();
    students.add(new Student(name, point));
    System.out.println("学生が追加されました。");
  }

  public void removeStudent(Scanner scanner) {
    System.out.println("削除する学生の名前を入力してください:");
    String name = scanner.next();
    scanner.nextLine();
    students.removeIf(student -> student.name.equals(name));
    System.out.println("学生が削除されました。");
  }

  public void updateStudent(Scanner scanner) {
    System.out.println("学生の名前を入力してください:");
    String name = scanner.next();
    scanner.nextLine();
    System.out.println(name + "の点数を入力してください:");
    int point = scanner.nextInt();
    scanner.nextLine();
    for (Student students : students ) {
      if (students.name.equals(name)) {
        students.point = point;
        System.out.println("点数が更新されました。");
        return;
      }
    }
  }

  public void averageStudent() {
    System.out.print("平均点:");
    double average = students.stream()
        .mapToInt(Student::getPoint)
        .average()
        .orElse(0);
    System.out.println(average + "点");
  }

  public void displayAllStudents() {
    if(students.isEmpty()) {
      System.out.println("データがありません");
    } else {
      System.out.println("学生一覧:");
      students.stream().forEach(student -> System.out.println(student + "点"));
      System.out.println();
    }
  }

  public void closeStudentList() {
    System.out.println("プログラムを終了します。");
    scanner.close();
    System.exit(0);
  }

}

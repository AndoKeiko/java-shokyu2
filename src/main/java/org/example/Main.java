package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StudentAssessment studentAssessment = new StudentAssessment();

    while (true) {
      System.out.println("1. 学生を追加");
      System.out.println("2. 学生を削除");
      System.out.println("3. 点数を更新");
      System.out.println("4. 平均点を計算");
      System.out.println("5. 全学生の情報を表示");
      System.out.println("6. 終了");
      System.out.print("選択してください:");

      int choice = scanner.nextInt();
      System.out.println();
      try {
          switch (choice) {
            case 1:
              studentAssessment.addStudent(scanner);
              break;
            case 2:
              studentAssessment.removeStudent(scanner);
              break;
            case 3:
              studentAssessment.updateStudent(scanner);
              break;
            case 4:
              studentAssessment.averageStudent();
              break;
            case 5:
              studentAssessment.displayAllStudents();
              break;
            case 6:
              studentAssessment.closeStudentList();
              break;
          }
      } catch (Exception e) {
        choice = scanner.nextInt();
      }
    }



  }
}
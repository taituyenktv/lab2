import entity.Student;
import handle.StudentHandle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentHandle studentHandle = new StudentHandle();
        System.out.println("Mời bạn nhập số học sinh muốn thêm thông tin : ");
        int numbStudent = Integer.parseInt(sc.nextLine());
        Student[] students = new Student[numbStudent];
        for (int i = 0; i < numbStudent; i++) {
            Student student = studentHandle.inputStudent(sc, i);
            students[i] = student;

        }
        for (Student s : students) {
            System.out.println(s);
            System.out.println("Điểm trung bình môn là :  " + studentHandle.avgScore(s));
            System.out.println("Xếp loại là :  " + studentHandle.rank(s) + "\n ");

        }
        studentHandle.displayPercentOfRank(students);

    }
}

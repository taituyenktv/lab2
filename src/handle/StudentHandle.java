package handle;

import entity.Student;

import java.util.Scanner;

public class StudentHandle {
    public Student inputStudent(Scanner sc, int i) {
        System.out.println("Mời bạn nhập Tên của học sinh thứ " + (i + 1) + " : ");
        String name = sc.nextLine();
        System.out.println("Mời bạn nhập điểm số môn Toán: ");
        double scoreMath = Double.parseDouble(sc.nextLine());
        while (0 > scoreMath || scoreMath > 10) {
            System.out.println("Theo thang điểm 10 mời bạn nhập lại điểm Toán: ");
            scoreMath = Double.parseDouble(sc.nextLine());
        }

        System.out.println("Mời bạn nhập điểm số môn Lý: ");
        double scorePhysic = Double.parseDouble(sc.nextLine());
        while (0 > scorePhysic || scorePhysic > 10) {
            System.out.println("Theo thang điểm 10 mời bạn nhập lại điểm Lý: ");
            scorePhysic = Double.parseDouble(sc.nextLine());
        }

        System.out.println("Mời bạn nhập điểm số môn Hóa: ");
        double scoreChemistry = Double.parseDouble(sc.nextLine());
        while (0 > scoreChemistry || scoreChemistry > 10) {
            System.out.println("Theo thang điểm 10 mời bạn nhập lại điểm Hóa: ");
            scoreChemistry = Double.parseDouble(sc.nextLine());
        }

        Student student = new Student(name, scoreMath, scorePhysic, scoreChemistry);
        return student;
    }

    public double avgScore(Student student) {

        return (student.getScoreChemistry() + student.getScoreMath() + student.getScorePhysic()) / 3;
    }

    public String rank(Student student) {
        String rank = "";

        if (avgScore(student) < 6.5) {
            rank = "C";
        } else if (6.5 <= avgScore(student) && avgScore(student) < 8) {
            rank = "B";

        } else if (avgScore(student) >= 8) {
            rank = "A";
        }
        return rank;

    }

    public void displayPercentOfRank(Student[] students) {
        double perA = 0, perB = 0, perC = 0;

        for (Student st : students) {
            if (rank(st).equalsIgnoreCase("a")) perA += 1;
            else if (rank(st).equalsIgnoreCase("b")) perB += 1;
            else if (rank(st).equalsIgnoreCase("c")) perC += 1;
        }
        System.out.println("Tỉ lệ xếp hạng A :" + (perA / students.length) * 100 + "%");
        System.out.println("Tỉ lệ xếp hạng B :" + (perB / students.length) * 100 + "%");
        System.out.println("Tỉ lệ xếp hạng C :" + (perC / students.length) * 100 + "%");

    }
}




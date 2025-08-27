package assignment0;

import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // name
        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.println("CSE131 Grade for: " + name);
        System.out.print("Number of studios attended: ");
        String studiosAttended = in.nextLine();
        double Weight1 = Double.parseDouble(studiosAttended) / 8 * 0.15 * 100;
        Weight1 = Math.round(Weight1 * 100) / 100.0;
        System.out.println("Weighted studio grade (out of 15): " + Weight1 + "%");

        // quiz
        System.out.print("Average quiz grade: ");
        String averageQuizGrade = in.nextLine();
        double Weight2 = Double.parseDouble(averageQuizGrade) * 0.25;
        Weight2 = Math.round(Weight2 * 100) / 100.0;
        System.out.println("Weighted quiz grade (out of 25): " + Weight2 + "%");


        // exam
        System.out.print("Average exam grade: ");
        String averageExamGrade = in.nextLine();
        double Weight3 = Double.parseDouble(averageExamGrade) * 0.60;
        Weight3 = Math.round(Weight3 * 100) / 100.0;
        System.out.println("Weighted exam grade (out of 60): " + Weight3 + "%");


        // final grade
        double finalGrade = Weight1 + Weight2 + Weight3;
        finalGrade = Math.round(finalGrade * 100) / 100.0;
        System.out.println("Final grade (out of 100): " + finalGrade + "%");
    }
}

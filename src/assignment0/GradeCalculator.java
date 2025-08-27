package assignment0;

import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = in.nextInt();
        String grade = calculateGrade(score);
        System.out.println("Your grade is: " + grade);
    }

    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

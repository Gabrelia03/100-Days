package isc;

import java.util.Scanner;

public class isc15 {

    public static void main(String[] args) {
        int nilai;
        String grade;
        Scanner sc = new Scanner(System.in);

        System.out.print("Inputkan nilai: ");
        nilai = sc.nextInt();

        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Grade: " + grade);
    }

}

package isc;

import java.util.Scanner;

public class isc79 {

    public static void main(String[] args) {
        //Menghitung volume slinder
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jari-jari silinder: ");
        double jariJari = sc.nextDouble();

        System.out.print("Masukkan tinggi silinder: ");
        double tinggi = sc.nextDouble();

        double volume = Math.PI * jariJari * jariJari * tinggi;
        System.out.println("Volume silinder: " + volume);
    }

}

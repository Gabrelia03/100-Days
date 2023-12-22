package isc;

import java.util.Scanner;

public class isc75 {

    public static void main(String[] args) {
        //menghitung luas trapesium
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi atas trapesium: ");
        double a = sc.nextDouble();

        System.out.println("Masukkan panjang sisi bawah trapesium: ");
        double b = sc.nextDouble();

        System.out.println("Masukkan tinggi trapesium: ");
        double h = sc.nextDouble();

        double luas = (a + b) * h / 2;

        System.out.println("Luas trapesium adalah: " + luas);

        sc.close();
    }

}

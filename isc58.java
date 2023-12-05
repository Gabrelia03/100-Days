package isc;

import java.util.Scanner;

public class isc58 {

    public static void main(String[] args) {
        //Operator logika
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap");
        } else {
            System.out.println(angka + " adalah bilangan ganjil");
        }
    }

}

package isc;

import java.util.Scanner;

public class isc66 {

    public static void main(String[] args) {
        //Menghitung luas permukaan balok
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        double panjang = sc.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = sc.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = sc.nextDouble();

        double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Luas permukaan balok: " + luasPermukaan);
    }

}

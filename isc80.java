package isc;

import java.util.Scanner;

public class isc80 {

    public static void main(String[] args) {
        //Menghitung luas bujur sangkar
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan panjang sisi: ");
        double sisi = sc.nextDouble();
        double area = sisi * sisi;
        System.out.println("Luas bujur sangkar adalah: " + area);
    }

}

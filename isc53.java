package isc;

import java.util.Scanner;

public class isc53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nilai luas permukaan (dalam m^2): ");
        double luasPermukaan = sc.nextDouble();

        System.out.println("Masukkan nilai kecepatan aliran air (dalam m/s): ");
        double kecepatanAliranAir = sc.nextDouble();

        double debitAir = luasPermukaan * kecepatanAliranAir;
        System.out.println("Debit air adalah " + debitAir + " m^3/s");
    }

}

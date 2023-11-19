package isc;

import java.util.Scanner;

public class isc42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        int angkaPertama = sc.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int angkaKedua = sc.nextInt();

        System.out.println("Bilangan Prima antara " + angkaPertama + " dan " + angkaKedua + " adalah ");
        for (int i = angkaPertama; i <= angkaKedua; i++) {
            if (angkaPrima(i)) {
                System.out.println(i);
            }

        }

    }

    private static boolean angkaPrima(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

}

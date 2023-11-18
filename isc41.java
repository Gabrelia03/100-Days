package isc;

import java.util.Scanner;

public class isc41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int angka = sc.nextInt();
            if (angka % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("Ganjil");
                break;
            }

        }
    }

}

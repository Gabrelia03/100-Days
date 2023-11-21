package isc;

import java.util.Scanner;

public class isc44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan;
        char ulang;

        do {
            System.out.println("# Daftar Menu Minuman #");
            System.out.println("=====================================");
            System.out.println("1. Teh Original");
            System.out.println("2. Red Velvet");
            System.out.println("3. GreenTea");
            System.out.println("4. ThaiTea");
            System.out.println("5. Teh Susu");
            System.out.println();

            System.out.println("Pilihan Anda : ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Teh Original");
                    break;
                case 2:
                    System.out.println("Anda memilih Red Velvet");
                    break;
                case 3:
                    System.out.println("Anda memilih GreenTea");
                    break;
                case 4:
                    System.out.println("Anda memililh ThaiTea");
                    break;
                case 5:
                    System.out.println("Anda memilih Teh Susu");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");

            }
            System.out.println();

            System.out.println("Ingin memilih menu lain (y/t)? ");
            ulang = sc.next().charAt(0);

            System.out.println();
        } while (ulang != 't');
        System.out.println("Terimakasih");
    }

}

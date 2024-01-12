package isc;

import java.util.Scanner;

public class isc96 {

    public static void main(String[] args) {
        // Mengonversi setiap karakter dalam kata ke kode ASCII
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = sc.nextLine();

        System.out.print("Kode ASCII untuk setiap karakter dalam kata adalah: ");
        for (int i = 0; i < kata.length(); i++) {
            char karakter = kata.charAt(i);
            int kodeAscii = (int) karakter;
            System.out.print(kodeAscii + " ");
        }
    }

}

package isc;

import java.util.Scanner;

public class isc93 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan lima karakter: ");
        char[] karakter = new char[5];
        for (int i = 0; i < 5; i++) {
            karakter[i] = sc.next().charAt(0);
        }
        System.out.print("Karakter yang dimasukkan: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(karakter[i] + " ");
        }
    }

}

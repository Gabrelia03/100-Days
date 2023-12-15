package isc;

import java.util.Scanner;

public class isc68 {

    public static void main(String[] args) {
        //Konversi sebuah kalimat menjadi huruf besar
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = sc.nextLine();
        String kalimatBesar = kalimat.toUpperCase();
        System.out.println("Kalimat dalam huruf besar: " + kalimatBesar);
    }

}

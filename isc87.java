package isc;

import java.util.Scanner;

public class isc87 {

    public static void main(String[] args) {
        //Menggabungkan dua kata menjadi satu string
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan kata pertama: ");
        String kataPertama = sc.next();

        System.out.println("Masukkan kata kedua: ");
        String kataKedua = sc.next();

        String gabungan = kataPertama + " " + kataKedua;
        System.out.println("Hasil penggabungan: " + gabungan);
    }

}

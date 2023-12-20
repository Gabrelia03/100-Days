package isc;

import java.util.Calendar;
import java.util.Scanner;

public class isc73 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        int tahun_lahir;
        int tahun_sekarang;
        int umur;

        Calendar kalender = Calendar.getInstance();
        tahun_sekarang = kalender.get(Calendar.YEAR);

        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan Tahun Lahir: ");
        tahun_lahir = sc.nextInt();

        umur = tahun_sekarang - tahun_lahir;

        System.out.println("Nama Kamu: " + nama);
        System.out.println("Umur Kamu Adalah " + umur + " Tahun");

    }

}

package isc;

import java.util.Scanner;

public class isc39 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        char golongan;
        int jamKerja = 0, upahPerJam = 0, totalUpah;

        System.out.print("Nama Karyawan : ");
        nama = input.nextLine();

        System.out.print("Golongan : ");
        golongan = input.next().charAt(0);

        System.out.print("Jumlah Jam Kerja : ");
        jamKerja = input.nextInt();

        System.out.println();

        switch (golongan) {
            case 'A':
                upahPerJam = 5000;
                break;
            case 'B':
                upahPerJam = 7000;
                break;
            case 'C':
                upahPerJam = 8000;
                break;
            case 'D':
                upahPerJam = 10000;
                break;

        }
        totalUpah = jamKerja * upahPerJam;

        if ((jamKerja - 48) > 0) {
            totalUpah = totalUpah + ((jamKerja - 48) * 4000);
        }
        System.out.println(nama + " menerima upah Rp." + totalUpah + " per minggu");
    }

}

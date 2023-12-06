package isc;

import java.util.Scanner;

public class isc59 {

    public static void main(String[] args) {
        //untuk menghitung nilai akhir mahasiswa berdasarkan nilai tugas, UTS, dan UAS 
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();
        double nilaiAkhir = (0.2 * tugas) + (0.3 * uts) + (0.5 * uas);
        System.out.println("Nilai akhir mahasiswa adalah: " + nilaiAkhir);
    }
}

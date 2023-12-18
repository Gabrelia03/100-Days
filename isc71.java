package isc;

import java.util.Scanner;

public class isc71 {

    public static void main(String[] args) {
        //Mencari nilai rata rata
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();
        int[] data = new int[jumlahData];
        double total = 0;
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
            total += data[i];
        }
        double rata_rata = total / jumlahData;
        System.out.println("Nilai rata-rata dari data adalah: " + rata_rata);
    }
}

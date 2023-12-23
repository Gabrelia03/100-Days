package isc;

import java.util.Scanner;

public class isc76 {

    public static void main(String[] args) {
        //Program Kasir Sederhana
        Scanner sc = new Scanner(System.in);
        int totalHarga = 0; // Inisialisasi variabel totalHarga dengan nilai 0
        boolean isSelesai = false; // Inisialisasi variabel isSelesai dengan nilai false

        System.out.println("===== PROGRAM KASIR SEDERHANA =====");

        // Perulangan akan terus berjalan selama isSelesai bernilai false
        while (!isSelesai) {
            System.out.print("Masukkan harga barang (atau 0 untuk selesai): ");
            int hargaBarang = sc.nextInt(); // Menerima input harga barang dari user

            if (hargaBarang == 0) {
                isSelesai = true; // Mengubah nilai isSelesai menjadi true jika user selesai memasukkan barang
            } else {
                totalHarga += hargaBarang; // Menambahkan harga barang ke variabel totalHarga
            }
        }

        System.out.println("Total harga yang harus dibayar: " + totalHarga);
    }

}

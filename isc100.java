package isc;

import java.util.Scanner;

public class isc100 {

    public static void main(String[] args) {
        //Program Pemesanan Tiket Konser
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama konser: ");
        String namaKonser = sc.nextLine();

        System.out.print("Masukkan tanggal konser: ");
        String tanggalKonser = sc.nextLine();

        System.out.print("Masukkan jumlah tiket yang dibeli: ");
        int jumlahTiket = sc.nextInt();

        System.out.print("Masukkan harga per tiket: ");
        double hargaPerTiket = sc.nextDouble();

        double totalHarga = jumlahTiket * hargaPerTiket;

        System.out.println("Konser: " + namaKonser);
        System.out.println("Tanggal konser: " + tanggalKonser);
        System.out.println("Jumlah tiket: " + jumlahTiket);
        System.out.println("Harga per tiket: " + hargaPerTiket);
        System.out.println("Total harga: " + totalHarga);
    }

}

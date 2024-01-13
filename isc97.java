package isc;

import java.util.Scanner;

public class isc97 {

    public static void main(String[] args) {
        //Struk Belanja Sederhana
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = sc.nextInt();
        System.out.print("Masukkan harga satuan: ");
        int hargaSatuan = sc.nextInt();
        int totalHarga = jumlahBarang * hargaSatuan;
        System.out.println("Jumlah barang: " + jumlahBarang);
        System.out.println("Harga satuan: " + hargaSatuan);
        System.out.println("Total harga: " + totalHarga);

    }

}

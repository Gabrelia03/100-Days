package isc;

import java.util.Scanner;

public class isc54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        String nim;
        String fakultas;
        String jurusan;
        String kota_asal;
        String alamat;

        System.out.print("Nama mahasiswa: ");
        nama = sc.nextLine();

        System.out.print("Nim: ");
        nim = sc.nextLine();

        System.out.print("Fakultas: ");
        fakultas = sc.nextLine();

        System.out.print("Jurusan: ");
        jurusan = sc.nextLine();

        System.out.print("Kota asal: ");
        kota_asal = sc.nextLine();

        System.out.print("Alamat: ");
        alamat = sc.nextLine();

        System.out.println();

        System.out.println("-----Data Mahasiswa-----");
        System.out.println("=========================");
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Kota asal: " + kota_asal);
        System.out.println("Alamat: " + alamat);
    }

}

package isc;

import java.util.Scanner;

public class isc94 {

    public static void main(String[] args) {
        //Menghitung persentase
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = sc.nextInt();
        System.out.print("Masukkan jumlah data yang diinginkan: ");
        int dataDiinginkan = sc.nextInt();

        double persentase = ((double) dataDiinginkan / jumlahData) * 100;
        System.out.println("Persentase: " + persentase + "%");
    }

}

package isc;

import java.util.Scanner;

public class isc45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalBelanja;
        double hargaAkhir;

        System.out.print("Total Belanja : Rp.");
        totalBelanja = sc.nextInt();
        System.out.println();

        if ((totalBelanja >= 100000) && (totalBelanja < 500000)) {
            hargaAkhir = totalBelanja - (0.1 * totalBelanja);
            System.out.println("Selamat Anda Mendapatn Diskon 10%");
        } else if ((totalBelanja >= 500000) && (totalBelanja < 1000000)) {
            hargaAkhir = totalBelanja - (0.2 * totalBelanja);
            System.out.println("Selamat Anda Mendapat Diskon 20%");
        } else if ((totalBelanja >= 1000000)) {
            hargaAkhir = totalBelanja - (0.3 * totalBelanja);
            System.out.println("Selamat Anda Mendapat Diskon 30%");
        } else {
            hargaAkhir = totalBelanja;
        }

        System.out.println("Total Bayar : Rp." + hargaAkhir);
    }

}

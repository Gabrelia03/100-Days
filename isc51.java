package isc;

import java.util.Scanner;

public class isc51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Kalimat: ");
        String kalimat = sc.nextLine();
        String[] kata = kalimat.split("\\s+");
        int jumlahKata = kata.length;
        System.out.println("Jumlah kata : " + jumlahKata);
    }

}


package isc;

import java.util.Scanner;


public class isc84 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        String[] kata = kalimat.split(" ");
        int panjangKterpanjang = 0;
        String kataTerpanjang = "";

        for (String k : kata) {
            int panjangKata = k.length();
            if (panjangKata > panjangKterpanjang) {
                panjangKterpanjang = panjangKata;
                kataTerpanjang = k;
            }
        }

        System.out.println("Kata terpanjang: " + kataTerpanjang);
        System.out.println("Panjang kata: " + panjangKterpanjang);
    }
    
}

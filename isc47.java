package isc;

import java.util.Scanner;

public class isc47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        int vokal = 0;
        char ch;

        System.out.print("Input kata / kalimat : ");
        x = sc.nextLine();

        for (int i = 0; i < x.length(); i++) {
            ch = x.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
                vokal++;

            }
        }
        //Tampilkan huruf vokal jika ditemukan
        if (vokal > 0) {
            System.out.println("Jumlah huruf vokal = " + vokal);

        } else {
            System.out.println("Huruf vokal tidak ditemukan");
        }
    }

}

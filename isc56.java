package isc;

import java.util.Scanner;

public class isc56 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah_deret;

        System.out.print("Jumlah deret yang diinginkan: ");
        jumlah_deret = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= jumlah_deret; i++) {
            System.out.print(i * 5 + " ");

        }
        System.out.println();
    }

}

package isc;

import java.util.Scanner;

public class isc64 {

    public static void main(String[] args) {
        //Konversi Desimal ke Biner
        Scanner sc = new Scanner(System.in);

        int[] nilai = new int[32];
        int n, i;

        System.out.print("Input angka desimal: ");
        n = sc.nextInt();

        for (i = 0; n > 0; i++) {
            nilai[i] = n % 2;
            n = n / 2;

        }

        System.out.print("Angka binernya adalah: ");

        for (i = i - 1; i >= 0; i--) {
            System.out.print(nilai[i]);
        }

        System.out.println();
    }

}

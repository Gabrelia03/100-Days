package isc;

import java.util.Scanner;

public class isc77 {

    public static void main(String[] args) {
        //menhitung nilai median
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Masukkan elemen-elemen array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        if (n % 2 == 0) {
            int median = (array[n / 2 - 1] + array[n / 2]) / 2;
            System.out.println("Nilai median: " + median);
        } else {
            int median = array[n / 2];
            System.out.println("Nilai median: " + median);
        }
    }
}

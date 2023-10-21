package isc;

import java.util.Scanner;

public class isc13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai mahasiswa: ");
        int nilai = input.nextInt();
        if (nilai >= 70) {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
    }

}

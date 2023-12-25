package isc;

import java.util.Scanner;

public class isc78 {

    public static void main(String[] args) {
        //Menghitung hasil pangkat dari basis dan eksponen
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan basis: ");
        double basis = sc.nextDouble();

        System.out.print("Masukkan eksponen: ");
        double eksponen = sc.nextDouble();

        double hasil = Math.pow(basis, eksponen);
        System.out.println("Hasil pangkat: " + hasil);
    }

}

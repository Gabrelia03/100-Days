package isc;

import java.util.Scanner;

public class isc85 {

    public static void main(String[] args) {
        //Mdembandingkan dua angka
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka1 = sc.nextInt();

        System.out.print("Masukkan angka: ");
        int angka2 = sc.nextInt();

        System.out.println("Jika " + angka1 + " lebih kecil dari " + angka2 + " maka nilainya adalah " + (angka1 < angka2));
    }
}

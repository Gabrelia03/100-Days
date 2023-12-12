package isc;

import java.util.Scanner;

public class isc65 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;
        int pembagi = 0;
        boolean angka_prima = true;

        System.out.print("Input sebuat angka bulat: ");
        angka = sc.nextInt();

        //0 dan 1 bukan angka prima
        if (angka == 0 || angka == 1) {
            angka_prima = false;
        } else {
            for (int i = 2; i <= angka / 2; i++) {
                if (angka % i == 0) {
                    pembagi = i;
                    angka_prima = false;
                    break;
                }

            }
        }

        if (angka_prima) {
            System.out.println(angka + " adalah angka prima");
        } else {
            System.out.println(angka + " bukan angka prima karena bisa dibagi " + pembagi);
        }
    }
}

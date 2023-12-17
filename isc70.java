package isc;

import java.util.Scanner;

public class isc70 {

    public static void main(String[] args) {
        //Menghitung pajak tahunan
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan penghasilan tahunan: ");
        double penghasilan = sc.nextDouble();
        double pajak = 0;
        if (penghasilan > 30000000) {
            pajak = 0.2 * penghasilan;
        }
        System.out.println("Pajak yang harus dibayarkan: " + pajak);

    }

}

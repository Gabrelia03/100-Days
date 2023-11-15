
package isc;

import java.util.Scanner;


public class isc38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--------Program Java Menentukan Nama Hari----------");
        System.out.println("===================================================");
        System.out.println();
        
        int n;
        System.out.println("Input angka hari (1-7) :");
        n = input.nextInt();
        
        if (n == 1){
            System.out.println("Senin");
        }
        else if (n == 2){
            System.out.println("Selasa");
        }
        else if (n == 3){
            System.out.println("Rabu");
        }
        else if (n == 4){
            System.out.println("Kamis");
        }
        else if (n == 5){
            System.out.println("Jumat");
        }
        else if (n == 6){
            System.out.println("Sabtu");
        }
        else if (n == 7){
            System.out.println("Minggu");
        }
        else {
            System.out.println("Pilihan Tidak Tersedia");
        }
    }
    
}

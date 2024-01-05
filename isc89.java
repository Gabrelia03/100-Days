package isc;

import java.util.Scanner;

public class isc89 {

    public static void main(String[] args) {
        //Menghitung banyaknya bilangan genap antara 1 sampai n
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        System.out.println("Banyaknya bilangan genap antara 1 sampai " + n + " adalah " + count);
    }

}

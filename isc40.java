package isc;

import java.util.Scanner;

public class isc40 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, n, total;

        System.out.print("Input Jumlah Deret Yang Diinginkan : ");
        n = input.nextInt();
        System.out.println();

        total = 1;
        System.out.print(1);
        for (i = 2; i <= n; i++) {
            System.out.print(" + " + i);
            total = total + i;

        }
        System.out.println(" = " + total);
        input.close();
    }

}

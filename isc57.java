package isc;

import java.util.Scanner;

public class isc57 {

    public static void main(String[] args) {
        //Mencari akar persamaan kuadrat
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        int D;
        double x1;
        double x2;

        System.out.println("Format persamaan: ax^2 + bx + c = 0");
        System.out.print("Input nilai a: ");
        a = sc.nextInt();
        System.out.print("Input nilai b: ");
        b = sc.nextInt();
        System.out.print("Input milai c: ");
        c = sc.nextInt();

        System.out.println();

        D = (b * b) - (4 * a * c);
        System.out.print("Diskriminan = " + D);

        if (D > 0) {
            System.out.println(" {akar real dan berbeda)");
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (D == 0) {
            System.out.println(" (akar real dan sama)");
            x1 = x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println(" (akar tidak real/imajiner)");
        }
    }

}

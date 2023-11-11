
package isc;

import java.util.HashSet;
import java.util.Scanner;


public class isc34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> nim = new HashSet<>();

        String input;
        while (!(input = sc.nextLine()).equalsIgnoreCase("Exit")) {
            if (nim.contains(input)) {
               System.out.println("NIM " + input + " sudah ada didalam HashSet");
            } else {
                nim.add(input);
            }
        }

        System.out.println(nim);
    }
    
}

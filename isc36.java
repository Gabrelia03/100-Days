
package isc;

import java.util.HashMap;
import java.util.Scanner;


public class isc36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> data = new HashMap<>();
        while (true) {
            System.out.print("NIM  : ");
            String key = sc.nextLine();
            if (key.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Nama : ");
            String value = sc.nextLine();
            if (data.containsKey(key)) {
                System.out.println("NIM sudah ada didalam data");
            } else {
                data.put(key, value);
            }
        }
        System.out.println(data);
    }
    
}

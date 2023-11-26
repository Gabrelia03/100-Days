
package isc;

import java.util.Scanner;


public class isc49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int year;
        
        System.out.println("Input tahun: ");
        year = sc.nextInt();
        
        if (year % 400 == 0) {
            System.out.println(year + " adalah tahun kabisat");
        }
        else if (year % 100 == 0) {
            System.out.println(year + " bukan tahun kabisat");
        }
        else if ( year % 4 == 0 ) {
            System.out.println(year + " adalah tahun kabisat");
        }
        else {
            System.out.println(year + " bukan tahun kabisat");
        }
    }
    
}

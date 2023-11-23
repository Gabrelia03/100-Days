
package isc;

import java.util.Scanner;


public class isc46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double jari2, keliling;
        
        System.out.println("Input jari-jari lingkaran : ");
        jari2 = sc.nextDouble();
        
        keliling = 3.14*2*jari2;
        keliling = Math.round(keliling*100)/100.0;
        
        System.out.println("Keliling lingkaran : "+keliling);
        
        sc.close();
    }
    
}

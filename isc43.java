
package isc;

import java.util.Scanner;


public class isc43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        int angkaBiner, angkaDesimal=0, i=1, digit;
        
        System.out.print("Input Angka Biner : ");
        angkaBiner = sc.nextInt();
        
        System.out.println("Angka Desimal Dari Biner " + angkaBiner);
        
        while(angkaBiner!=0) {
            digit = angkaBiner % 10;
            angkaDesimal = angkaDesimal + (digit*i);
            i = i*2;
            angkaBiner = angkaBiner/10;
        }
        System.out.println("adalah : "+ angkaDesimal);
    }
    
}

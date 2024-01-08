
package isc;

import java.util.Scanner;


public class isc92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float bunga;
        float pinjam;
        float hasil;
        
        System.out.print("Masukkan Bunga (Persen %): ");
        bunga = sc.nextFloat();
        System.out.print("Masukkan Pinjam (Rp.): ");
        pinjam = sc.nextFloat();
        hasil = (bunga/100)*pinjam;
        
        System.out.println("Total: "+ hasil);
    }
    
}

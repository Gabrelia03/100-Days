package isc;

import java.util.Scanner;

public class isc90 {

    public static void main(String[] args) {
        //Mencetak sebuah kalimat dalam urutan yang terbalik
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = sc.nextLine();
        String kalimat_terbalik = "";

        for (int i = kalimat.length() - 1; i >= 0; i--) {
            kalimat_terbalik += kalimat.charAt(i);

        }
        System.out.println("Kalimat dalam urutan terbalik: " + kalimat_terbalik);
    }

}

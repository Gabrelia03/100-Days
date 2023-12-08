package isc;

import java.util.Scanner;

public class isc61 {

    public static void main(String[] args) {
        //Menghitung luas permukaan dan volume bola
        Scanner sc = new Scanner(System.in);

        double jari2, luas_permukaan, volume;

        System.out.print("Input jari-jari bola: ");
        jari2 = sc.nextDouble();

        System.out.println();

        luas_permukaan = (4.0 / 3.0) * (22.0 / 7.0) * jari2 * jari2 * jari2;
        luas_permukaan = Math.round(luas_permukaan * 100) / 100.0;

        volume = 4 * (22.0 / 7.0) * jari2 * jari2;
        volume = Math.round(volume * 100) / 100.0;

        System.out.println("Luas permukaan bola = " + luas_permukaan);
        System.out.println("Volume bola = " + volume);

        sc.close();
    }
}

}

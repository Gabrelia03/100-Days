package isc;

import java.util.Scanner;

public class isc69 {

    public static void main(String[] args) {
        //konversi suhu celcius ke fahrenheit
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = input.nextDouble();
        double fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
    }

}

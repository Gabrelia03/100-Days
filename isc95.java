package isc;

public class isc95 {

    public static void main(String[] args) {
        //mencetak angka dari 1-100 yang habis dibagi 3
        int angka = 1;
        while (angka <= 100) {
            if (angka % 3 == 0) {
                System.out.println(angka);
            }
            angka++;
        }
    }

}

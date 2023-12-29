package isc;

public class isc82 {

    public static void main(String[] args) {
        //Penggunaan casting
        int angkaBulat = 10;
        double angkaDesimal = (double) angkaBulat;

        System.out.println("Angka bulat: " + angkaBulat);
        System.out.println("Angka desimal setelah casting: " + angkaDesimal);

        double angkaDesimal2 = 23.5;
        int angkaBulat2 = (int) angkaDesimal2;

        System.out.println("Angka desimal: " + angkaDesimal2);
        System.out.println("Angka bulat setelah casting: " + angkaBulat2);
    }

}

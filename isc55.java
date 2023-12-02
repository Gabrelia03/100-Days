package isc;

public class isc55 {

    public static void main(String[] args) {
        //perbandingan
        int angka1 = 15;
        int angka2 = 15;

        // Membandingkan dua bilangan menggunakan operator perbandingan
        boolean lebihBesar = angka1 > angka2;
        boolean lebihKecil = angka1 < angka2;
        boolean samaDengan = angka1 == angka2;
        boolean tidakSama = angka1 != angka2;

        // Menampilkan hasil perbandingan
        System.out.println(angka1 + " lebih besar dari " + angka2 + ": " + lebihBesar);
        System.out.println(angka1 + " lebih kecil dari " + angka2 + ": " + lebihKecil);
        System.out.println(angka1 + " sama dengan " + angka2 + ": " + samaDengan);
        System.out.println(angka1 + " tidak sama dengan " + angka2 + ": " + tidakSama);
    }
}

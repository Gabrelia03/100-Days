package isc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class isc83 {

    public static void main(String[] args) {
        //Menambah elemen dan menentukan posisinya menggunakan ArrayList
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka untuk menambahkan elemen: ");
        int angka = sc.nextInt();
        System.out.println("Masukkan posisi tambahan: ");
        int posisi = sc.nextInt();

        list.add(posisi, angka);

        System.out.println("Elemen yang baru: " + list.get(posisi));
        System.out.println("Elemen yang tersisa: " + list);
    }

}

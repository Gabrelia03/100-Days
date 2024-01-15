package isc;

import java.util.Scanner;

public class isc99 {

    public static void main(String[] args) {
        //Menghitung jumlah pecahan uang
        Scanner sc = new Scanner(System.in);

        //input jumlah uang
        System.out.print("Masukkan jumlah uang: ");
        double jumlah = sc.nextDouble();

        //menghitung jumlah ratus ribu
        int ratusRibu = (int) (jumlah / 100000);
        int sisa = (int) (jumlah % 100000);

        //menghitung jumlah puluh ribu
        int puluhRibu = (int) (sisa / 10000);
        sisa = sisa % 10000;

        //menghitung jumlah ribuan
        int ribuan = (int) (sisa / 1000);
        sisa = sisa % 1000;

        //menghitung jumlah ratusan
        int ratusan = sisa / 100;

        //cetas  hasil
        System.out.println("Jumlah uang = " + jumlah);
        System.out.println("Jumlah ratus ribuan = " + ratusRibu);
        System.out.println("Jumlah puluh ribuan = " + puluhRibu);
        System.out.println("Jumlah ribuan = " + ribuan);
        System.out.println("Jumlah rastusan = " + ratusan);

    }

}

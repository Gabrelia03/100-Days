package isc;

import java.util.Scanner;

public class isc88 {

    public static void main(String[] args) {
        //Login menggunakan username dan password
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Username: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Password: ");
        String password = sc.nextLine();

        if (nama.equals("Gabrelia") && password.equals("geby123")) {
            System.out.println("LOGIN BERHASIL");
        } else {
            System.out.println("LOGIN TIDAK BERHASIL");
        }
    }

}

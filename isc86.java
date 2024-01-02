package isc;

import java.math.BigInteger;

public class isc86 {

    public static void main(String[] args) {
        BigInteger angkaPertama = new BigInteger("345455678");
        BigInteger angkaKedua = new BigInteger("223556281");

        BigInteger kurang = angkaPertama.subtract(angkaKedua);
        System.out.println("Hasil hitung: " + kurang);

    }

}

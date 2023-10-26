package isc;

import java.util.ArrayList;

public class isc18 {

    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Gabrelia");
        data.add("Geby");
        data.add("Sukma");
        System.out.println("Data Sebelum Dihapus = " + data);

        data.remove("Geby");
        System.out.println("Data Setelah Dihapus = " + data);

    }

}

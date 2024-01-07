package isc;

public class isc91 {

    public static void main(String[] args) {
        //Mencari elemen yang sama dari dua array
        int[] array1 = {1, 2, 6, 1, 8, 9, 4};
        int[] array2 = {3, 0, 6, 7, 2, 3, 5};
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("Elemen yang sama yaitu: " + array1[i]);
                }
            }

        }
    }
}

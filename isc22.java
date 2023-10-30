package isc;

public class isc22 {

    public static void main(String[] args) {
        double[] data = {91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11,
            27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4,
            53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768};

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        int k = 0;
        int kolom = 10;

        while (k < data.length) {
            sum += data[k];
            if (min > data[k]) {
                min = data[k];
            }
            if (max < data[k]) {
                max = data[k];
            }
            if (k % kolom == 0) {
                System.out.print("[");
            }
            System.out.print(data[k]);
            k++;
            if (k % kolom == 0) {
                System.out.println("]");
            } else {
                System.out.print(", ");
            }
        }

        System.out.println("MIN = " + min);
        System.out.println("MAX = " + max);
        System.out.println("SUM = " + sum);
        int n = data.length;
        double avg = sum / n;
        System.out.println("AVG = " + avg);

    }

}

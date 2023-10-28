package isc;

import java.util.Vector;

public class isc20 {

    public static void main(String[] args) {

        Vector<Double> data = new Vector<>();
        data.add(91.35);
        data.add(91.35);
        data.add(4.72);
        data.add(26.0);
        data.add(3.5);
        data.add(8.0);
        data.add(61.0);
        data.add(65.36);
        data.add(12.0);
        data.add(5.6);

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;

        System.out.println(data);

        for (double a : data) {
            if (min > a) {
                min = a;
            }
            if (max < a) {
                max = a;
            }
            sum += a;
        }
        System.out.println("MIN = " + min);
        System.out.println("MAX = " + max);
        System.out.println("SUM = " + sum);
        System.out.println("AVG = " + (sum / data.size()));
    }

}

package algomath.chap3.text;

import java.util.Random;

public class Code_3_05_1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int N = 100001;
        int M = 0;
        for (int i=1;i<N;i++) {
            double px = rd.nextDouble(); // 0이상 1이하 random double
            double py = rd.nextDouble();

            if (px*px + py*py < 1.0) {
                M++;
            }

        }
        System.out.printf("%.12f", (4.0*M)/N);
    }
}

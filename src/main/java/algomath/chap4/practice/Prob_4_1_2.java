package algomath.chap4.practice;

import java.util.Scanner;

// p.195
public class Prob_4_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n+1];
        long[] y = new long[n+1];
        for (int i=1;i<n+1;i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }
        double min = Double.MAX_VALUE;
        for (int i=1; i<n;i++) {
            for (int j=i+1;j<n+1;j++) {
                double cur = Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]));
                min = Math.min(min, cur);
            }
        }
        System.out.format("%.12f\n", min);
    }
}

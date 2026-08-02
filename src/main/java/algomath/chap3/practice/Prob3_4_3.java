package algomath.chap3.practice;

import java.util.Scanner;

// p.131
public class Prob3_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        long asum = 0;
        for (int i=1;i<n+1;i++) {
            a[i] = sc.nextInt();
            asum+= a[i];
        }
        long bsum = 0;
        for (int i=1;i<n+1;i++) {
            b[i] = sc.nextInt();
            bsum+= b[i];
        }
        double expect = asum / 3.0 + ((bsum*2) / 3.0);
        System.out.println(expect);
    }
}

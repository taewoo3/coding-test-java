package algomath.chap4.practice;

import java.util.Scanner;

public class Prob_4_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i=1;i<n;i++) {
            a[i] = sc.nextLong();
        }
        int m = sc.nextInt();
        int[] b = new int[m+1];
        for (int i=1;i<m+1;i++) {
            b[i] = sc.nextInt();
        }

        long[] c = new long[n+1];
        c[1] = 0;
        for (int i=2;i<n+1;i++) {
            c[i] = c[i-1] + a[i-1];
        }
        long ans = 0;
        for (int i=1;i<m;i++) {
            ans += Math.abs(c[b[i]] - c[b[i+1]]);
        }
        System.out.println(ans);
    }
}

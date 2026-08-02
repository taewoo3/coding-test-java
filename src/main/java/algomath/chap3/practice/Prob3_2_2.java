package algomath.chap3.practice;

import java.util.Scanner;

public class Prob3_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        for (int i=1;i<n+1;i++) {
            a[i] = sc.nextLong();
        }
        long answer = a[1];
        for (int i=2;i<n+1;i++) {
            answer = gcd(answer, a[i]);
        }

        System.out.println(answer);
    }

    public static long gcd(long a, long b) {
        while (a >=1 && b>=1) {
            if (a>b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        if (a>=1) {
            return a;
        }
        return b;
    }
}

package algomath.chap5.sec2;

import java.util.Scanner;
// id : 62
// 푸는중
public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for (int i=0; i<n;i++) {
            a[i] = sc.nextInt();
        }
        int[] pattern = new int[n];
        pattern[0] = a[0];
        for (int i=1; i<n;i++) {
            pattern[i] = a[pattern[i-1]-1];
        }
        for (int i=0;i<n;i++) {
            System.out.println(pattern[i]);
        }
        int cycle = 0;
        for (int i=0; i<n; i++) {
            if (pattern[i] == 1) {
                cycle = i+1;
            }
        }

    }
}

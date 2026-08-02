package algomath.chap2.practice;

import java.util.Scanner;

public class Prob2_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1; i<n+1;i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i=1;i<n+1;i++) {
            ans += a[i];
            ans %= 100;
        }
        System.out.println(ans);
    }
}

package algomath.chap3.text;

import java.util.Scanner;
// 개구리 발판, p. 166
public class Code_3_07_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1;i<n+1;i++) {
            a[i] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        dp[1] = 0;
        dp[2] = Math.abs(a[2] - a[1]);
        for (int i=3;i<n+1;i++) {
            int j1 = dp[i-1] + Math.abs(a[i] - a[i-1]);
            int j2 = dp[i-2] + Math.abs(a[i] - a[i-2]);
            dp[i] = Math.min(j1, j2);
        }
        System.out.println(dp[n]);
    }
}

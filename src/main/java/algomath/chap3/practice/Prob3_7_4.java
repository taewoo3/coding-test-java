package algomath.chap3.practice;

import java.util.Scanner;

// p.178, p.62, 부분합을 동적계획법으로
public class Prob3_7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1;i<n+1;i++) {
            a[i] = sc.nextInt();
        }
        boolean[][] dp = new boolean[n+1][s+1];
        dp[0][0] = true;
        for (int i=1;i<n+1;i++) {
            for (int j=0;j<s+1;j++) {
                if (j < a[i]) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-a[i]];
                }
            }
        }
        if (dp[n][s]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

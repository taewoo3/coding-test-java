package algomath.chap3.text;
// 냅색문제, p.171

import java.util.Scanner;

public class Code_3_07_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int wlimit = sc.nextInt();
        int[] w = new int[n+1];
        int[] v = new int[n+1];
        for (int i=1;i < n+1; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        // dp[i][j] : i번째까지 써서 무게가 j일때의 v합 최대값

        long[][] dp = new long[n+1][wlimit+1];

        long INF = 1000000000000000000L;
        dp[0][0] = 0;
        for (int i=1;i<wlimit+1;i++) {
            dp[0][i] = -INF;
        }

        for (int i=1;i<n+1;i++) {
            for (int j=0;j<wlimit+1;j++) {
                if (j < w[i]) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]] +v[i]);
                }
            }
        }

        long ans = -1;
        for (int i=0;i<wlimit+1;i++) {
            ans = Math.max(ans, dp[n][i]);
        }
        System.out.println(ans);
    }
}

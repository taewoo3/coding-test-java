package algomath.chap3.practice;
// p.179, dp연습,
// int -> long
import java.util.Scanner;

public class Prob3_7_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        for (int i=1;i<n+1;i++) {
            a[i] = sc.nextInt();
        }
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = a[1];
        for (int i=2;i<n+1;i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + a[i]);
        }
        System.out.println(dp[n]);
    }
}

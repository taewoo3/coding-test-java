package algomath.chap3.text;
// 계단오르기, p.169
import java.util.Scanner;

public class Code_3_07_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2;i<n+1;i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }
}

package algomath.chap4.sec7;

import java.util.Scanner;

public class Prob3 {
    public static long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[][] a = new long[3][3];
        a[0][0] = 1; a[0][1] = 1; a[0][2] = 1;
        a[1][0] = 1; a[1][1] = 0; a[1][2] = 0;
        a[2][0] = 0; a[2][1] = 1; a[2][2] = 0;
        long[][] b = power(a, n-3);
        long answer = (b[0][0]*2 + b[0][1] + b[0][2]) % MOD;
        System.out.println(answer);
    }
    public static long[][] copy(long[][] a) {
        long[][] ans = new long[3][3];
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                ans[i][j] = a[i][j];
            }
        }
        return ans;
    }

    public static long[][] multiply(long[][] a, long[][] b) {
        long[][] ans = new long[3][3];
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                for (int k=0;k<3;k++) {
                    ans[i][j] += a[i][k]*b[k][j];
                    ans[i][j] %= MOD;
                }
            }
        }
        return ans;
    }

    public static long[][] power(long[][] a, long n) {
        long[][] ans = new long[3][3];
        ans[0][0] = 1; ans[0][1] = 0; ans[0][2] = 0;
        ans[1][0] = 0; ans[1][1] = 1; ans[1][2] = 0;
        ans[2][0] = 0; ans[2][1] = 0; ans[2][2] = 1;
        long[][] p = copy(a);
        for (int i=0;i<60;i++) {
            if ((n & (1L << i)) != 0L) {
                ans = multiply(ans, p);
            }
            p = multiply(p,p);
        }
        return ans;
    }
}

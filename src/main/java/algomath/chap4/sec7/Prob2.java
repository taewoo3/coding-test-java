package algomath.chap4.sec7;

import java.util.Scanner;
/*
행렬의 제곱도 반복제곱법으로 하면됨.
 */
public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[][] a = new long[2][2];
        a[0][0] = 2; a[0][1] = 1;
        a[1][0] = 1; a[1][1] = 0;
        long[][] b = power(a, n-1);
        long answer = (b[1][0] + b[1][1])% MOD;
        System.out.println(answer);
    }
    public static long MOD = 1000000007;

    public static long[][] multiply(long[][] a, long[][] b) {
        long[][] ans = new long[2][2];
        for (int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                for (int k=0;k<2;k++) {
                    ans[i][j] += a[i][k]*b[k][j];
                    ans[i][j] %= MOD;
                }
            }
        }
        return ans;
    }

    public static long[][] copy(long[][] a) {
        long[][] target = new long[2][2];
        for (int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                target[i][j] = a[i][j];
            }
        }
        return target;
    }

    public static long[][] power(long[][] a, long n) {
        long[][] ans = new long[2][2];
        ans[0][0] = 1; ans[0][1] = 0;
        ans[1][0] = 0; ans[1][1] = 1;
        long[][] p = copy(a);

        for (int i=0;i<60;i++) {
            if ((n & (1L <<i)) != 0L) {
                ans = multiply(ans, p);
            }
            p = multiply(p, p);
        }
        return ans;
    }
}

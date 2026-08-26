package algomath.chap4.text;

import java.util.Scanner;
// id : 050
public class Code_4_06_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(modpow(a,b));
    }

    public static long modpow(int a, int b) {
        int limit = 1; // 2^k <= b인 2^k의 최대값
        int k = 0; //
        while (limit<b) {
            limit = limit << 1;
            k++;
        }
        long[] part = new long[k+1]; // part[i]= a^(2^i)
        part[0] = a;
        for (int i=1;i<k+1;i++) {
            part[i] = (part[i-1]*part[i-1]) % 1000000007;
        }
        long result = 1;
        int idx = 0;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * part[idx]) % 1000000007;
            }
            idx++;
            b = b >> 1;
        }
        return result;
    }
}

package algomath.chap3.text;

import java.util.Scanner;
// 최대공약수 재귀 없이 푸는법
public class Code_3_02_1_try2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(gcd(a,b));
    }

    public static long gcd(long a, long b) {
        while (a >= 1 && b>=1) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        if (a >= 1) {
            return a;
        }
        return b;
    }
}

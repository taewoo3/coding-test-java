package algomath.chap3.text;

import java.util.Scanner;
// 최대공약수 문제
public class Code_3_02_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(gcd(a,b));
    }

    public static long gcd(long a, long b) {
        if (b > a) {
            long temp = b;
            b = a;
            a = temp;
        }

        if (a == b) {
            return a;
        } else {
            if (a % b != 0) {
                return gcd(b, a % b);
            } else {
                return b;
            }
        }
    }
}

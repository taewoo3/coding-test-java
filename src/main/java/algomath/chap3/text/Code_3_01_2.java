package algomath.chap3.text;

import java.util.Scanner;
// 빠른 소수 판정
public class Code_3_01_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // nextInt하면 런타임 오류
        long firstDivisor = -1;
        boolean isPrime = true;
        for (long i=2; i*i<n;i++) {
            if (n % i == 0) {
                firstDivisor = i;
                break;
            }
        }
        if (firstDivisor > 0 && firstDivisor != n) {
            isPrime = false;
        }

        if (isPrime) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

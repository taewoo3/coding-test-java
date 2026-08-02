package algomath.chap3.practice;

import java.util.Scanner;

public class Prob3_1_2_try2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        for (long i=2; i*i<=n;i++) {
            while(n>1 && n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n>=2) {
            System.out.println(n);
        }
    }
}

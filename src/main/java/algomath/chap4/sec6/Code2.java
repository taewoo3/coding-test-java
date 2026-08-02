package algomath.chap4.sec6;

import java.util.Scanner;

/*
p.265
피보나치 수를 100000007로 나눈 나머지
 */
public class Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fibo = new int[n+1];
        fibo[1] = 1;
        fibo[2] = 1;
        for (int i=3;i<n+1;i++) {
            fibo[i] = (fibo[i-1] + fibo[i-2]) % 1000000007;
        }
        System.out.println(fibo[n]);
    }
}

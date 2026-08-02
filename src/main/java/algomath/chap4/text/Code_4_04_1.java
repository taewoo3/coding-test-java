package algomath.chap4.text;

import java.util.Scanner;

// 에라토스테네스의 체, p.223
public class Code_4_04_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isPrime = new boolean[n+1];
        for (int i=2;i<n+1;i++) {
            isPrime[i] = true;
        }
        for (int i=2;i*i<=n;i++) {
            if (isPrime[i]) {
                for (int j=2*i;j<n+1;j=j+i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i=2; i<n+1;i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

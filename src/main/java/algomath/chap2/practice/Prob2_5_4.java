package algomath.chap2.practice;

import java.util.Scanner;
// 에라토스테네스의 체!
public class Prob2_5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] isPrime = new int[n+1];
        for (int i=1;i<n+1;i++) {
            isPrime[i] = 1;
        }
        isPrime[1] = 0;

        for (int i=2;i<n+1;i++) {
            if (isPrime[i] == 1) {
                for (int j=2;j*i<n+1;j++) {
                    isPrime[j*i] = 0;
                }
            }
        }
        int primeCnt = 0;
        for (int i = 2; i<n+1;i++) {
            if (isPrime[i] == 1) {
                primeCnt++;
            }
        }
        for (int idx = 2;idx<n+1;idx++) {
            if (isPrime[idx] == 1) {
                System.out.print(idx);
                if (primeCnt > 1) {
                    System.out.print(" ");
                }
                primeCnt--;
            }
        }
    }
}

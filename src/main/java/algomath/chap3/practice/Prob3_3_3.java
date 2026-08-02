package algomath.chap3.practice;

import java.util.Scanner;

public class Prob3_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        long fact_n = 1;
        for (int i=1;i<n+1;i++) {
            fact_n *= i;
        }
        long fact_r = 1;
        for (int i=1;i<r+1;i++) {
            fact_r *= i;
        }
        long fact_n_r = 1;
        for (int i=1;i<n-r+1;i++) {
            fact_n_r *= i;
        }
        System.out.println((fact_n/fact_r)/fact_n_r);
    }
}

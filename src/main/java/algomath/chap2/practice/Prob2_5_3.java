package algomath.chap2.practice;

import java.util.Scanner;

public class Prob2_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i=1; i<n+1 ; i++) {
            ans *= i;
        }
        System.out.println(ans);
    }
}

package algomath.chap4.practice;

import java.util.Scanner;

public class Prob_4_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i=1;i<n+1;i++) {
            for (int j=i;j<n+1;j=j+i) {
                ans += j;
            }
        }
        System.out.println(ans);
    }
}

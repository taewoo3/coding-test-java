package algomath.chap2.text;

import java.util.Scanner;

public class Code_2_01_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int sum = 0;

        for (int i = 1; i<n+1; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println(sum);
    }
}

package algomath.chap4.text;

import java.util.Scanner;

// p.201, id:038
// TODO 더 빠른 입력은 학습 건너뜀
public class Code_4_02_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n+1];
        int[] left = new int[q+1];
        int[] right = new int[q+1];
        for (int i=1;i<n+1;i++) {
            a[i] = sc.nextInt();
        }
        for (int i=1;i<q+1;i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }
        long[] cum_a = new long[n+1];
        cum_a[0] = 0;
        cum_a[1] = a[1];
        for (int i=2;i<n+1;i++) {
            cum_a[i] = cum_a[i-1] + a[i];
        }
        for (int i=1;i<q+1;i++) {
            long ans = cum_a[right[i]] - cum_a[left[i]-1];
            System.out.println(ans);
        }
    }
}

package algomath.chap3.text;

import java.util.Scanner;

public class Code_3_06_5 {
    static int n = 0;
    static int[] a;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n+1];
        for (int i=1;i<n+1;i++) {
            a[i] = sc.nextInt();
        }

        int answer = solve(1, n+1);
        System.out.println(answer);
    }

    private static int solve(int l, int r) {
        if (r-l == 1) {
            return a[l];
        }
        int m = (l+r)/2;
        int s1 = solve(l, m);
        int s2 = solve(m, r);
        return s1 + s2;
    }
}

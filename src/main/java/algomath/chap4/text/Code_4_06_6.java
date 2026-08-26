package algomath.chap4.text;

import java.util.Scanner;
// id: 049
public class Code_4_06_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        a[1]=1;
        a[2]=1;
        for (int i=3;i<n+1;i++) {
            a[i] = (a[i-1] + a[i-2]) % 1000000007;
        }
        System.out.println(a[n]);
    }
}

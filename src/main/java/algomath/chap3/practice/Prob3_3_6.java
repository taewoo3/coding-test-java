package algomath.chap3.practice;

import java.util.Scanner;

public class Prob3_3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        long[] cnt = new long[100009]; // 이걸 int로 했다가 오답이 나옴
        // cnt*cnt가 200000 * 200000 이면 이미 이게 int곱이라서 오버플로우가 된다.
        for (int i=1;i<n+1;i++) {
            a[i] = sc.nextInt();
            cnt[a[i]] += 1;
        }
        long answer = 0;
        for (int i=1;i<50000;i++) {
            answer += cnt[i] * cnt[100000 - i];
        }
        answer += (cnt[50000] * (cnt[50000]-1) / 2);
        System.out.println(answer);
    }
}

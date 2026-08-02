package algomath.chap4.text;

import java.util.Scanner;
// id:039, p.204
// 단순하게 풀면 시간초과
public class Code_4_02_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 지역
        int q = sc.nextInt(); // 일수
        int[] left = new int[q+1];
        int[] right = new int[q+1];
        int[] x = new int[q+1]; // 적설량
        long[] cha = new long[n+2]; // cha[i] = (i)지역적설량-(i-1)지역 적설량, cha[0] 은 안씀
        for (int i=1;i<q+1;i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
            x[i] = sc.nextInt();
            cha[left[i]] += x[i];
            cha[right[i]+1] -= x[i];
        }
        for (int i=1;i<n;i++) {
            if (cha[i+1] > 0) { // (i+1)누적 - (i)누적 > 0
                System.out.print("<");
            } else if (cha[i+1] == 0) {
                System.out.print("=");
            } else {
                System.out.print(">");
            }
        }
    }
}

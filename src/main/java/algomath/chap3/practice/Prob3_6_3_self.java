package algomath.chap3.practice;

import java.util.Scanner;
//MergeSort
public class Prob3_6_3_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] c = new int[n+1];

        for (int i=1;i<n+1;i++) {
            a[i] = sc.nextInt();
        }

        MergeSort(a, c, 1, n+1);
        for (int i=1;i<n+1;i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void MergeSort(int[] a, int[] c, int l, int r) {
        if (r - l == 1) {
            return;
        }
        int m = (l + r)/2;
        MergeSort(a, c, l, m); // leftPart
        MergeSort(a, c, m, r); // rightPart

        int leftPartIdx = l;
        int rightPartIdx = m;
        int cnt = 0;
        while(leftPartIdx != m || rightPartIdx != r) {
            if (leftPartIdx == m) {
                c[cnt] = a[rightPartIdx];
                rightPartIdx++;
            } else if (rightPartIdx == r) {
                c[cnt] = a[leftPartIdx];
                leftPartIdx++;
            } else {
                if (a[leftPartIdx] < a[rightPartIdx]) {
                    c[cnt] = a[leftPartIdx];
                    leftPartIdx++;
                } else {
                    c[cnt] = a[rightPartIdx];
                    rightPartIdx++;
                }
            }
            cnt++;
        }
        for (int i=l;i<r;i++) {
            a[i] = c[i-l];
            c[i-l] = 0;
        }
    }
}

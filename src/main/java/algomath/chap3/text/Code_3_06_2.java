package algomath.chap3.text;

import java.util.Scanner;
// 선택정렬
// p.145
public class Code_3_06_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }

        for (int i=0; i<n-1;i++) {
            int min = a[i];
            int minIndex = i;
            for (int j=i+1;j<n;j++) {
                if (min > a[j]) {
                    min = a[j];
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        for (int i=0; i<n;i++) {
            System.out.print(a[i] + " ");
        }
    }
}

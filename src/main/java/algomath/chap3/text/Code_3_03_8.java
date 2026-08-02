package algomath.chap3.text;

import java.util.Scanner;
// p. 118
// 13
//243 156 104 280 142 286 196 132 128 195 265 300 130
// 전체 탐색해도 시간 초과 안된다는걸 생각 못함..
public class Code_3_03_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];

        for (int i=1;i<n+1;i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i=1;i<n-3;i++) {
            for (int j=i+1;j<n-2;j++) {
                for (int k=j+1;k<n-1;k++) {
                    for (int l=k+1;l<n;l++) {
                        for (int m=l+1;m<n+1;m++) {
                            if (a[i] + a[j] + a[k] + a[l] + a[m] == 1000) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}

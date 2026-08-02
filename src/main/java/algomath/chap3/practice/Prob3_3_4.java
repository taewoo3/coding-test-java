package algomath.chap3.practice;

import java.util.Scanner;

//p.114 / 3.3.6
public class Prob3_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        long[] count = new long[5];
        for (int i=0;i<5;i++) {
            count[i]=0;
        }
        for (int i=1; i<n+1;i++) {
            a[i] = sc.nextInt();
            switch(a[i]) {
                case 100:
                    count[1]++;
                    break;
                case 200:
                    count[2]++;
                    break;
                case 300:
                    count[3]++;
                    break;
                case 400:
                    count[4]++;
                    break;
                default:
                    break;
            }
        }
        long answer = count[1]*count[4] + count[2]*count[3];
        System.out.println(answer);
    }
}

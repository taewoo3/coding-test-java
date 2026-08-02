package algomath.chap5.sec2;

import java.util.Scanner;
// ID 059
public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r = n % 4;
        int answer = 0;
        if (r == 1) {
            answer = 2;
        } else if (r==2) {
            answer = 4;
        } else if (r==3) {
            answer = 8;
        } else if (r==0) {
            answer = 6;
        }
        System.out.println(answer);
    }
}

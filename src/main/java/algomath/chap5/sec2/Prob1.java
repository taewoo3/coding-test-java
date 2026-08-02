package algomath.chap5.sec2;

import java.util.Scanner;
// ID 061
// 문제 번역이 이상함
// 돌을 잡을 수 있는 조건이 잘못됨
public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (isSecond(n)) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }

    public static boolean isSecond(long n) {
        if (n<3) {
            return n == 1;
        } else {

                return isPowerOfTwo(n+1);

        }
    }
    public static boolean isPowerOfTwo(long n) {
        int cnt = 0;
        for (int i=0;i<32;i++) {
            if ((n & (1<<i)) != 0) {
                cnt++;
            }
        }
        if (cnt == 1) {
            return true;
        } else {
            return false;
        }
    }
}

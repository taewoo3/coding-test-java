package algomath.chap5.sec1;

import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        boolean answer = false;
        if (Math.abs(x) + Math.abs(y) > n) {
            answer = false;
        } else if (Math.abs(x) + Math.abs(y) == n) {
            answer = true;
        } else if ((n-Math.abs(x) - Math.abs(y)) % 2 == 0) {
            answer = true;
        }
        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

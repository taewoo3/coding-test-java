package algomath.chap4.practice;

import java.util.Scanner;

public class Prob_4_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long r1 = sc.nextLong();
        long x2 = sc.nextLong();
        long y2 = sc.nextLong();
        long r2 = sc.nextLong();
        if (r1 < r2) {
            long temp = x1;
            x1 = x2;
            x2 = temp;
            temp = y1;
            y1 = y2;
            y2 = temp;
            temp = r1;
            r1 = r2;
            r2 = temp;
        }
        double centerdist = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        int answer = 0;
        if (centerdist == r1 + r2) {
            answer = 4;
        } else if (centerdist > r1+ r2) {
            answer = 5;
        } else {
            if (centerdist + r2 == r1) {
                answer = 2;
            } else if (centerdist + r2 < r1) {
                answer = 1;
            } else {
                answer = 3;
            }
        }
        System.out.println(answer);
    }
}

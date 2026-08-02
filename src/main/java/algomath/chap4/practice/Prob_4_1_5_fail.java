package algomath.chap4.practice;

import java.util.Scanner;
// 이렇게 풀면 틀림!
// double을 안쓰고 풀려면 외적을 써야됨!
public class Prob_4_1_5_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();

        long x2 = sc.nextLong();
        long y2 = sc.nextLong();

        long x3 = sc.nextLong();
        long y3 = sc.nextLong();

        long x4 = sc.nextLong();
        long y4 = sc.nextLong();
        
        // 1st 선분
        Double a1 = null;
        Double b1 = null;
        if (x2 != x1) {
            a1 = (double)(y2-y1)/(x2-x1);
            b1 = y1 - a1*x1;
        }
        // 2nd 선분
        Double a2 = null;
        Double b2 = null;
        if (x4 != x3) {
            a2 = (double)(y4-y3)/(x4-x3);
            b2 = y3 - a2*x3;
        }



        String ans = "No";
        double inter_x;
        double inter_y;
        if (a1 != null && a2 != null) {
            if (!a1.equals(a2)) { // 문제될 거 같은 부분..
                // 교점
                inter_x = (b2-b1)/(a1-a2);
                inter_y = a1*inter_x + b1;
                if (meet(inter_x, x1, x2, x3, x4) && meet(inter_y, y1, y2, y3, y4)) {
                    ans = "Yes";
                }
            } else {
                // 같은 기울기 (절편 다르면 평행) -> no
                if (b1.equals(b2)) {
                    // 같은 기울기와 절편 (=같은 함수)
                    if (x1 > x2) {
                        long temp = x1;
                        x1 = x2;
                        x2 = temp;
                    }
                    if (x3 > x4) {
                        long temp = x3;
                        x3 = x4;
                        x4 = temp;
                    }
//                    if (!(x2 < x3 || x4 < x1)) {
//                        ans = "Yes";
//                    }
                    if (Math.max(x1, x3) <= Math.min(x2, x4)) {
                        ans = "Yes";
                    }
                }
            }
        } else if (a1 == null && a2 != null) {
            inter_x = x1;
            inter_y = a2*inter_x + b2;
            if (meet(inter_x, x1, x2, x3, x4) && meet(inter_y, y1, y2, y3, y4)) {
                ans = "Yes";
            }
        } else if (a1 != null) { // a1 != null && a2 == null
            inter_x = x3;
            inter_y = a1*inter_x + b1;
            if (meet(inter_x, x1, x2, x3, x4) && meet(inter_y, y1, y2, y3, y4)) {
                ans = "Yes";
            }
        } else { // a1 == null, a2 == null
            if (x1 == x3) {
                if (y1 > y2) {
                    long temp = y1;
                    y1 = y2;
                    y2 = temp;
                }
                if (y3 > y4) {
                    long temp = y3;
                    y3 = y4;
                    y4 = temp;
                }
//                if (!(y2 < y3 || y4 < y1)) {
//                    ans = "Yes";
//                }
                if (Math.max(y1, y3) <= Math.min(y2, y4)) {
                    ans = "Yes";
                }
            }
        }
        System.out.println(ans);
    }

    private static boolean meet(double inter, long c1, long c2, long c3, long c4) {
        boolean meet = false;
        if (c1 > c2) {
            long temp = c1;
            c1 = c2;
            c2 = temp;
        }
        if (c3 > c4) {
            long temp = c3;
            c3 = c4;
            c4 = temp;
        }
        if (c1 <= inter && inter <= c2 && c3 <= inter && inter <= c4) {
            meet= true;
        }
        return meet;
    }
}

package algomath.chap3.practice;

import java.util.Scanner;

// p.132, 기하분포
// 쿠폰 수집가의 문제:(Coupon Collector's Problem)
// 동전 앞면 확률 p, 뒷면 확률q(=1-p) 일때, 뒷면이 나올때까지 던지는 횟수의 기대값
// E = p*1 + q(1+E) => E = 1/p
// double 출력은 %.12f로!
// int를 double로 바꿀땐 1.0을 곱하면 된다.
//
public class Prob3_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double expect = 0.0;
        for (int i=1;i<n+1;i++) {
            expect += (1.0*n) / i;
        }
        System.out.printf("%.12f\n", expect);
    }
}

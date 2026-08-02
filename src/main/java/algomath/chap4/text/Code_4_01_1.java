package algomath.chap4.text;

import java.util.Scanner;
// p.190 id:033, 점 A와 선분 BC의 최단거리
public class Code_4_01_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ax = sc.nextLong();
        long ay = sc.nextLong();
        long bx = sc.nextLong();
        long by = sc.nextLong();
        long cx = sc.nextLong();
        long cy = sc.nextLong();
        // 벡터 BA
        long BAx = ax-bx; // a,b
        long BAy = ay-by;
        // 벡터 BC
        long BCx = cx-bx; // c,d
        long BCy = cy-by;
        // BA, BC 내적 = x끼리곱 + y끼리곱
        long BA_BC_inner_product = ((BAx)*(BCx) + (BAy)*(BCy));
        // 벡터 CA
        long CAx = ax - cx;
        long CAy = ay - cy;
        // 벡터 CB
        long CBx = bx - cx;
        long CBy = by - cy;
        // CA, CB 내적 = x끼리곱 + y끼리곱
        long CA_CB_inner_product = CAx * CBx + CAy * CBy;
        double answer;
        if (BA_BC_inner_product < 0) {
            // answer = BA크기;
            answer = Math.sqrt(Math.pow(BAx, 2) + Math.pow(BAy, 2));
        } else if (CA_CB_inner_product < 0) {
            // answer = CA크기;
            answer = Math.sqrt(Math.pow(CAx, 2) + Math.pow(CAy, 2));
        } else {
            // BA, BC 외적 =절대값(BAx*BCy-BAy*BCx) = 평행사변형 넓이
            double square = Math.abs(BAx * BCy - BAy * BCx);
            // BC 길이
            double BCLength = Math.sqrt(Math.pow(BCx, 2) + Math.pow(BCy, 2));
            answer = square / BCLength;
        }
        System.out.format("%.12f\n", answer);
    }
}

package algomath.chap4.practice;

import java.util.Scanner;

public class Prob_4_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long Ax = sc.nextLong();
        long Ay = sc.nextLong();
        long Bx = sc.nextLong();
        long By = sc.nextLong();
        long Cx = sc.nextLong();
        long Cy = sc.nextLong();
        long Dx = sc.nextLong();
        long Dy = sc.nextLong();

        // 벡터 AB
        long ABx = Bx-Ax;
        long ABy = By-Ay;
        // 벡터 AC
        long ACx = Cx-Ax;
        long ACy = Cy-Ay;
        // 벡터 AD
        long ADx = Dx-Ax;
        long ADy = Dy-Ay;


        // 벡터 CD
        long CDx = Dx-Cx;
        long CDy = Dy-Cy;

        // 벡터 CA
        long CAx = Ax-Cx;
        long CAy = Ay-Cy;

        // 벡터 CB
        long CBx = Bx-Cx;
        long CBy = By-Cy;


        long cross_AB_AC = cross(ABx, ABy, ACx, ACy);
        long cross_AB_AD = cross(ABx, ABy, ADx, ADy);
        long cross_CD_CA = cross(CDx, CDy, CAx, CAy);
        long cross_CD_CB = cross(CDx, CDy, CBx, CBy);
        String ans;
        if (cross_AB_AC == 0 && cross_AB_AD == 0
        && cross_CD_CA == 0 && cross_CD_CB == 0) {
            if (Ax == Bx && Bx == Cx && Cx == Dx) {
                // AB, CD 둘다 y축과 평행한 일직선일때
                if (Ay > By) {
                    long temp = Ay;
                    Ay = By;
                    By = temp;
                }
                if (Cy > Dy) {
                    long temp = Cy;
                    Cy = Dy;
                    Dy = temp;
                }
                if (Math.max(Ay, Cy) <= Math.min(By,Dy) ) {
                    ans = "Yes";
                } else {
                    ans = "No";
                }
            } else {
                // 평범하게 AB, CD가 일직선일때
                if (Ax > Bx) {
                    long temp = Ax;
                    Ax = Bx;
                    Bx = temp;
                }
                if (Cx > Dx) {
                    long temp = Cx;
                    Cx = Dx;
                    Dx = temp;
                }
                if (Math.max(Ax, Cx) <= Math.min(Bx, Dx)) {
                    ans = "Yes";
                } else {
                    ans = "No";
                }
            }
        } else {
            boolean isCDSeparateAB = false;
            boolean isABSeparateCD = false;
            if (cross_AB_AC <= 0 && cross_AB_AD >=0) {
                isCDSeparateAB = true;
            }
            if (cross_AB_AC >= 0 && cross_AB_AD <=0) {
                isCDSeparateAB = true;
            }
            if (cross_CD_CA <= 0 && cross_CD_CB >=0) {
                isABSeparateCD = true;
            }
            if (cross_CD_CA >=0 && cross_CD_CB <=0) {
                isABSeparateCD = true;
            }
            if (isCDSeparateAB && isABSeparateCD) {
                ans = "Yes";
            } else {
                ans = "No";
            }
        }
        System.out.println(ans);
    }

    private static long cross(long Ax, long Ay, long Bx, long By) {
        return Ax*By-Bx*Ay;
    }
}

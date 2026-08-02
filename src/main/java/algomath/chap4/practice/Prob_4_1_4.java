package algomath.chap4.practice;

import java.util.Scanner;

/**
 * double 끼면 int는 선언하지마라
 */
public class Prob_4_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double m = sc.nextDouble();
        double hourRadians = getHourRadians(h,m);
        double minuteRadians = getMinuteRadians(m);
        double hx = Math.cos(hourRadians)*a;
        double hy = Math.sin(hourRadians)*a;
        double mx = Math.cos(minuteRadians)*b;
        double my = Math.sin(minuteRadians)*b;
        double len = Math.sqrt((hx-mx)*(hx-mx) + (hy-my)*(hy-my));
        System.out.format("%.12f\n", len);
    }
    private static double getHourRadians(double h, double m) {
        double minDegrees = (30.0 / 60.0) * m;
        double baseHourDegrees = 0;
        if (h < 3.0) {
            baseHourDegrees = 90.0 - h*30.0;
        } else {
            baseHourDegrees = 360.0 - (h-3)*30.0;
        }
        return Math.toRadians(baseHourDegrees - minDegrees);
    }

    private static double getMinuteRadians(double m) {
        double minDegrees;
        if (m > 15) {
            minDegrees = 360.0 - 6.0*(m-15);
        } else {
            minDegrees = 90.0 - 6.0*m;
        }
        return Math.toRadians(minDegrees);
    }
}

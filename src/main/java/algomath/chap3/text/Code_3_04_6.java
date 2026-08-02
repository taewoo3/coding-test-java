package algomath.chap3.text;

import java.util.Scanner;

// p.128, 3.4.6
public class Code_3_04_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] p = new double[n+1];
        double[] q = new double[n+1];
        double expect = 0.0;
        for (int i=1;i<n+1;i++) {
            p[i] = sc.nextDouble();
            q[i] = sc.nextDouble();
            expect += q[i]/p[i];
        }
        System.out.println(expect);
    }
}

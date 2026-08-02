package algomath.chap3.text;

import java.util.Scanner;
// p.126 / 3.4.5
public class Code_3_04_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n+1];
        int[] r = new int[n+1];
        double bSum = 0;
        double rSum = 0;
        for (int i=1;i<n+1;i++) {
            int item = sc.nextInt();
            bSum += item;
        }
        for (int i=1;i<n+1;i++) {
            int item = sc.nextInt();
            rSum += item;
        }
        // 범위가 초과될까 걱정되면, 모아서 n으로 나누는게 아니라, 애초에 n으로 나눈걸 더하는 것도 방법이 된다.
        double expect = (bSum+rSum)/n;
        System.out.println(expect);
    }
}

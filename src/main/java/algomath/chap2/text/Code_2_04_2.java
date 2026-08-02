package algomath.chap2.text;

import java.util.Scanner;

public class Code_2_04_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int ans = 0;
        for (int i=1;i<n+1;i++) {
            for (int j=1;j<n+1;j++) {
                if (i + j <= s) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

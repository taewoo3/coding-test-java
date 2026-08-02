package algomath.chap2.text;

import java.util.Scanner;

public class Code_2_01_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        while (n>=1) {
            if (n % 2 == 0) {
                ans = "0" + ans;
            } else {
                ans = "1" + ans;
            }
            n /= 2;
        }
        System.out.println(ans);
    }
}

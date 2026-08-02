package algomath.chap3.text;

import java.util.Scanner;

public class Code_3_06_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
    }

    static int func(int n) {
        if (n == 1) {
            return 1;
        }
        return func(n-1) * n;
    }
}

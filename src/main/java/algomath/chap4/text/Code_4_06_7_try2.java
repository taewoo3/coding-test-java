package algomath.chap4.text;

import java.util.Scanner;

// id : 050
public class Code_4_06_7_try2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = 1000000007;
        System.out.println(modpow(a,b,m));
    }

    public static long modpow(int a, int b, int m) {
        long p = a; // a^2^0 -> a^2^1 -> ... a^2^30
        long answer = 1; // (a^b) % m
        for (int i=0;i<30;i++) {
            if ((b & (1 << i))!=0) {
                answer = (answer * p) % m;
            }
            p = (p * p) % m;
        }
        return answer;
    }
}

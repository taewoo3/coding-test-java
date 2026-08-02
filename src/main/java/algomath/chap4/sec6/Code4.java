package algomath.chap4.sec6;

import java.util.Scanner;

/*
p.267
 */
public class Code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long m = 1000000007;
        long answer = modpow(a,b,m);
        System.out.println(answer);
    }

    public static long modpow(long a, long b, long m) {
        long p = a;
        long answer = 1;
        for (int i=0;i<30;i++) {
            if ((b & (1<<i)) != 0) {
                answer = (answer * p) % m;
            }
            p = (p * p) % m;
        }
        return answer;
    }
}

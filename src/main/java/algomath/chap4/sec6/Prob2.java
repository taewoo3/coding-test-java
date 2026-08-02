package algomath.chap4.sec6;

import java.util.Scanner;
/*
예외케이스 생각 못함
id:52
p.275
 */
public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        long y = sc.nextInt();
        if ((x + y) % 3 != 0) {
            System.out.println(0);
            return;
        }
        long a = x - ((x+y)/3);
        long b = y - ((x+y)/3);
        if (a < 0 || b < 0) {
            System.out.println(0);
            return;
        }
        long MOD = 1000000007;
        if (a == 0 || b==0) {
            System.out.println(1);
            return;
        }
        long answer = ncr(a+b, a, MOD);
        System.out.println(answer);
    }
    //
    // (a의 b승) mod m
    public static long modpow(long a, long b, long m) {
        long p = a;
        long answer = 1;
        for (int i=0;i<30;i++) {
            if ((b & (1<<i)) != 0) {
                answer = (answer * p) % m;
            }
            p = (p*p) % m;
        }
        return answer;
    }

    public static long ncr(long n, long r, long m) {
        long bunmo = 1;
        long bunja = 1;
        for (long i=1;i<n+1;i++) {
            bunmo = (bunmo * i) % m;
        }
        for (long i=1;i<r+1;i++) {
            bunja = (bunja * i) % m;
        }
        for (long i=1;i<n-r+1;i++) {
            bunja = (bunja * i) % m;
        }
        // return (bunmo/bunja)%m => (bunmo*bunja의 모듈러역원)%m;
        return (bunmo*modpow(bunja, m-2, m))%m;
    }
}

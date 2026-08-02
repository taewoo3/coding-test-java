package algomath.chap4.sec6;

import java.util.Scanner;

/*
id:053
p.276
반복제곱법할때 long 범위 어려웠음
 */
public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = 1000000007;
        long answer = sum(n,m);
        System.out.println(answer);
    }

    public static long modpow(long a, long b, long m) {
        long p = a;
        long answer = 1;
        for (int i=0;i<60;i++) {
            if ((b&((long)1<<i)) != 0) {
                answer = (answer * p)%m;
            }
            p = (p*p)%m;
        }
        return answer;
    }
    public static long sum(long n, long m) {
        return ((modpow(4,n+1,m)-1) * modpow(3,m-2,m))%m;
    }
}

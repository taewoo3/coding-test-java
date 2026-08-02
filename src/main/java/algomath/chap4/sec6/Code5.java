package algomath.chap4.sec6;

import java.util.Scanner;
/*
p.269, x, y 범위 오타 (10의 5승이 105라고 써져있음)
 */
public class Code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        long m = 1000000007;
        long bunmo = 1;
        long bunja = 1;
        for (int i=1;i<x+y+1;i++) {
            bunja = (bunja * i) % m;
        }
        for (int i=1;i<x+1;i++) {
            bunmo = (bunmo * i) % m;
        }
        for (int i=1;i<y+1;i++) {
            bunmo = (bunmo * i) % m;
        }

        long answer = division(bunja, bunmo, m);
        System.out.println(answer);
    }
    // a의 b승을 m으로 나눈 나머지
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
    // ((a의 나머지) 나누기 (b의 나머지)) mod m
    // = ((a의 나머지) 곱하기 (b의 나머지의 모듈러 역원)) mod m
    // b의 나머지의 모듈러 역원 = (b의 나머지)의 m-2승
    public static long division(long a, long b, long m) {
        return (a * modpow(b, m-2, m)) % m;
    }
}

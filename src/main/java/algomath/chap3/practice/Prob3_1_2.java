package algomath.chap3.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prob3_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> answer = new ArrayList<>();
        List<Long> divisors = new ArrayList<>();
        for (long i=1; i*i <n; i++) {
            if (n % i == 0) {
                if (i != 1) {
                    divisors.add(i);
                }
                if (i != n/i) {
                    divisors.add(n/i);
                }
            }
        }
        Collections.sort(divisors);
        for (int i=0; i<divisors.size();i++) {
            long divisor = divisors.get(i);
            while (n>1 && n%divisor==0) {
                answer.add(divisor);
                n /= divisor;
            }
        }
        for (long i:answer) {
            System.out.print(i + " ");
        }
    }
}

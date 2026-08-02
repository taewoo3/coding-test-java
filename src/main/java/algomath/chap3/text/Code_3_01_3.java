package algomath.chap3.text;

import java.util.*;
// 모든 약수 출력
public class Code_3_01_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // nextInt하면 런타임 오류
        List<Long> divisors = new ArrayList<>();
        for (long i=1;i*i<=n;i++){
            if (n % i == 0) {
                divisors.add(i);
                if (i != (n/i)) {
                    divisors.add(n/i);
                }
            }
        }
        Collections.sort(divisors);

        for (int i=0; i<divisors.size(); i++) {
            System.out.println(divisors.get(i));
        }
    }
}

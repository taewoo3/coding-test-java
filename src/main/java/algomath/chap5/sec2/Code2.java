package algomath.chap5.sec2;

import java.util.Scanner;
// ID 060
public class Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String answer = "";
        if (n % 4 == 0) {
            answer = "Second";
        } else {
            answer = "First";
        }
        System.out.println(answer);
    }
}

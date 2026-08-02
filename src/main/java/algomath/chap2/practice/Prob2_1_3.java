package algomath.chap2.practice;

import java.util.Scanner;

public class Prob2_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[3];

        for (int i=0;i<3;i++) {
            input[i] = sc.nextInt();
        }
        System.out.println(input[0]*input[1]*input[2]);
    }
}

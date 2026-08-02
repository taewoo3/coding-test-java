package algomath.chap2.text;

import java.util.Scanner;

public class Code_2_01_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[4];

        for (int i=1;i<4;i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(A[1] + A[2] + A[3]);
    }
}

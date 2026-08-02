package algomath.chap3.practice;

import java.util.Scanner;
// p.116 / 3.3.7
// colorNum을 int로 해서 한번 틀렸음
public class Prob3_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n+1];
        long[] colorNum = new long[4]; // 1 : 붉은색, 2: 노란색, 3: 파란색

        for (int i=1;i<n+1;i++) {
            cards[i] = sc.nextInt();
            switch(cards[i]) {
                case 1:
                    colorNum[1]++;
                    break;
                case 2:
                    colorNum[2]++;
                    break;
                default:
                    colorNum[3]++;
                    break;
            }
        }
        long answer = 0;
        for (int i=1; i<4;i++) {
            answer += colorNum[i]*(colorNum[i]-1)/2;
        }
        System.out.println(answer);
    }
}

package algomath.chap5.sec2;

import java.util.Scanner;
// id : 62
public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n+1]; // index 0 비우고 1부터 채움
        for (int i=1; i<n+1;i++) {
            a[i] = sc.nextInt();
        }
        int[] pattern = new int[n+1];
        pattern[0] = 1;
        int[] patternCount = new int[n+1];
        patternCount[1] = 1;
        int[] cycleStartIdx = new int[n+1];
        cycleStartIdx[1] = 0;
        int[] cycleEndIdx = new int[n+1];
        int cycleStartNode = -1;
        int cycle = -1;
        for (int i=1; i<n+1;i++) {
            pattern[i] = a[pattern[i-1]];
            patternCount[pattern[i]]++;
            if (patternCount[pattern[i]] == 1) {
                cycleStartIdx[pattern[i]] = i;
            } else if (patternCount[pattern[i]] == 2) {
                cycleEndIdx[pattern[i]] = i;
                cycleStartNode = pattern[i];
                cycle = cycleEndIdx[pattern[i]] - cycleStartIdx[pattern[i]];
                break;
            }
        }
        if (k < cycleStartIdx[cycleStartNode]) {
            System.out.println(pattern[(int)k]);
        } else {
            int patternIdx = (int)((k-cycleStartIdx[cycleStartNode]) % (long)cycle);
            System.out.println(pattern[cycleStartIdx[cycleStartNode] + patternIdx]);
        }
    }
}

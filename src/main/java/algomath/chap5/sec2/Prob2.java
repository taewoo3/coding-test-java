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
        int[] pattern = new int[n+1]; // 방문 순서
        pattern[0] = 1;
        int[] patternCount = new int[n+1]; // 마을 방문 횟수 count
        patternCount[1] = 1;
        int[] cycleStartIdx = new int[n+1]; // 마을 방문 횟수 count가 2가 된 마을은 사이클이 생겼다 볼수있음
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
        // 사이클 시작지점보다 k가 작으면 걍 k번째 방문기록을 패턴에서 바로 찾음
        if (k < cycleStartIdx[cycleStartNode]) {
            System.out.println(pattern[(int)k]);
        } else {
            // (k-사이클 시작지점)%사이클 하면 방문 노드가 나옴
            int patternIdx = (int)((k-cycleStartIdx[cycleStartNode]) % (long)cycle);
            System.out.println(pattern[cycleStartIdx[cycleStartNode] + patternIdx]);
        }
    }
}

package algomath.chap5.sec2;

import java.util.Scanner;

public class Prob2_claude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) a[i] = sc.nextInt();

        int[] pattern = new int[n + 1];   // pattern[i] = i번째로 방문한 노드
        int[] firstSeenAt = new int[n + 1]; // 각 노드가 처음 등장한 index (-1: 아직 없음)
        java.util.Arrays.fill(firstSeenAt, -1);

        pattern[0] = 1;
        firstSeenAt[1] = 0;

        int cycleStart = -1; // 사이클이 시작되는 index
        int cycleLen = -1;   // 사이클 길이

        for (int i = 1; i <= n; i++) {
            pattern[i] = a[pattern[i - 1]];
            int node = pattern[i];

            if (firstSeenAt[node] != -1) {          // 이미 본 노드 -> 사이클 발견!
                cycleStart = firstSeenAt[node];
                cycleLen = i - cycleStart;
                break;                                // 더 진행할 필요 없음
            }
            firstSeenAt[node] = i;
        }

        long answerIdx;
        if (k < cycleStart) {
            answerIdx = k;
        } else {
            answerIdx = cycleStart + (k - cycleStart) % cycleLen;
        }

        System.out.println(pattern[(int) answerIdx]);
    }
}

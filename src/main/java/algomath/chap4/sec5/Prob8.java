package algomath.chap4.sec5;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
// 데잌스트라
// id 048
// p.257 k의 양의 배수중에서 자릿수 합이 최소인거 찾기
public class Prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<PairInt>[] G = new ArrayList[k];
        for (int i=0; i<k;i++) {
            G[i] = new ArrayList<>();
        }
        // edge 넣기
        // pairInt : 나머지, 비용(늘어나는 자리수합)
        for (int i=0;i<k;i++) {
            for (int j=0;j<10;j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                G[i].add(new PairInt((i*10 + j)%k, j));
            }
        }
        // 데익스트라를 위한 큐
        // pairInt : 거리, 포지션
        Queue<PairInt> Q = new PriorityQueue<>();
        Q.add(new PairInt(0,0));
        int[] dist = new int[k];
        boolean[] used = new boolean[k];
        for (int i=0;i<k;i++) {
            dist[i] = 1 << 30;
            used[i] = false;
        }
        while (!Q.isEmpty()) {
            PairInt p = Q.poll();
            int pos = p.second;
            if (used[pos]) {
                continue;
            }
            used[pos] = true;

            for (PairInt i: G[pos]) {
                int next = i.first;
                int cost;
                if (pos == 0) {
                    cost = i.second;
                } else {
                    cost = dist[pos] + i.second;
                }
                if (dist[next] > cost) {
                    dist[next] = cost;
                    Q.add(new PairInt(dist[next], next));
                }
            }
        }
        System.out.println(dist[0]);
    }

    public static class PairInt implements Comparable<PairInt> {
        int first;
        int second;

        public PairInt(int _first, int _second) {
            first = _first;
            second = _second;
        }
        @Override
        public int compareTo(PairInt p) {
            if (this.first < p.first || (this.first == p.first && this.second < p.second)) {
                return -1;
            }
            if (this.first > p.first || (this.first == p.first && this.second > p.second)) {
                return 1;
            }
            return 0;
        }
    }
}

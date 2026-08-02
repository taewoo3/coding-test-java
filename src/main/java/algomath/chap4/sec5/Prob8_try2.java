package algomath.chap4.sec5;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Prob8_try2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<PairInt>[] G = new ArrayList[k];
        for (int i=0;i<k;i++) {
            G[i] = new ArrayList<>();
        }
        for (int i=0;i<k;i++) {
            for (int j=0;j<10;j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                G[i].add(new PairInt((10*i+j)%k, j));
            }
        }

        int[] dist = new int[k];
        boolean[] used = new boolean[k];
        for (int i=0;i<k;i++) {
            dist[i] = 1 << 30;
            used[i] = false;
        }

        Queue<PairInt> queue  = new PriorityQueue<>();
        queue.add(new PairInt(0,0));

        while(!queue.isEmpty()) {
            PairInt cur = queue.poll();
            int pos = cur.second;
            if (used[pos]) {
                continue;
            }
            used[pos] = true;
            for (PairInt e: G[pos]) {
                int to = e.first;
                int cost;
                if (pos == 0) {
                    cost = e.second;
                } else {
                    cost = dist[pos] + e.second;
                }
                if (dist[to] > cost) {
                    dist[to] = cost;
                    queue.add(new PairInt(dist[to], to));
                }
            }
        }
        System.out.println(dist[0]);
    }

    public static class PairInt implements Comparable<PairInt> {
        int first;
        int second;
        public PairInt(int _first, int _second) {
            this.first = _first;
            this.second = _second;
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

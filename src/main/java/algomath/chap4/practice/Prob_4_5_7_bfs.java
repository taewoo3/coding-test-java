package algomath.chap4.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Prob_4_5_7_bfs {
    public static int[] color;
    public static boolean answer = true;
    public static ArrayList<Integer>[] G;
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buff.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점 수
        int M = Integer.parseInt(st.nextToken()); // 변 수
        G = new ArrayList[N+1];
        for (int i=1;i<N+1;i++) {
            G[i] = new ArrayList<>();
        }
        for (int i=1;i<M+1;i++) {
            st = new StringTokenizer(buff.readLine());
            int p1 = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());
            G[p1].add(p2);
            G[p2].add(p1);
        }

        color = new int[N+1];
        for (int i=1;i<N+1;i++) {
            color[i] = -1;
        }
        for (int i=1;i<N+1;i++) {
            if (color[i] == -1) {
                bfs(i);
            }
        }

        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void bfs(int start) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(start);
        color[start] = 1;
        while (!Q.isEmpty()) {
            int cur = Q.remove();
            for (int next: G[cur]) {
                if (color[next] == -1) {
                    color[next] = color[cur] == 1 ? 2 : 1;
                    Q.add(next);
                } else if (color[next] == color[cur]) {
                    answer = false;
                    return;
                }
            }
        }
    }
}

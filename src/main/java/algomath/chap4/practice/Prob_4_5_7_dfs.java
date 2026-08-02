package algomath.chap4.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Prob_4_5_7_dfs {
    public static ArrayList<Integer>[] G;
    public static int[] color;
    public static boolean answer = true;
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buff.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점 수
        int M = Integer.parseInt(st.nextToken()); // 변 수
        int[] A = new int[M+1];
        int[] B = new int[M+1];
        G = new ArrayList[N+1];
        for (int i=1;i<N+1;i++) {
            G[i] = new ArrayList<>();
        }
        for (int i=1;i<M+1;i++) {
            st = new StringTokenizer(buff.readLine());
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());

            G[A[i]].add(B[i]);
            G[B[i]].add(A[i]);
        }

        color = new int[N+1];
        for (int i=1;i<N+1;i++) {
            color[i] = -1;
        }
        for (int i = 1; i <= N; i++) {
            if (color[i] == -1) {
                // 정점 i가 흰색인 경우(아직 방문하지 않은 연결 성분인 경우)
                color[i] = 1;
                dfs(i);
            }
        }

        for (int i=1;i<M+1;i++) {
            if (color[A[i]] == color[B[i]]) {
                answer = false;
            }
        }

        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void dfs(int pos) {
        for (int next: G[pos]) {
            if (color[next] == -1) {
                color[next] = color[pos] == 1 ? 2: 1;
                dfs(next);
            }
        }
    }
}

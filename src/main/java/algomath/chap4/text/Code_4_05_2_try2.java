package algomath.chap4.text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Code_4_05_2_try2 {
    public static ArrayList<Integer>[] G;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(buff.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 수
        int M = Integer.parseInt(st.nextToken()); // 변 수
        int[] A = new int[M+1];
        int[] B = new int[M+1];
        for (int i=1;i<M+1;i++) {
            st = new StringTokenizer(buff.readLine());
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }

        G = new ArrayList[N+1];
        for (int i=1;i<N+1;i++) {
            G[i] = new ArrayList<>();
        }

        for (int i=1;i<M+1;i++) {
            G[A[i]].add(B[i]);
            G[B[i]].add(A[i]);
        }
        visited = new boolean[N+1];
        for (int i=1;i<N+1;i++) {
            visited[i] = false;
        }
        dfs(1);

        boolean answer = true;
        for (int i=1;i<N+1;i++) {
            if (visited[i] == false) {
                 answer = false;
            }
        }
    }

    public static void dfs(int pos) {
        visited[pos] = true;
        for (int i: G[pos]) {
            if (visited[i] == false) {
                dfs(i);
            }
        }
    }
}

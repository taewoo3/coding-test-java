package algomath.chap4.sec5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
그래프가 연결되어있는지 확인하기
깊이 우선 탐색으로 돌았을때 방문 안된 점이 있는지 찾기
p.246
재귀 방식
 */
public class Code2 {
    public static ArrayList<Integer>[] G;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(buff.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점 수
        int M = Integer.parseInt(st.nextToken()); // 변 수
        int[] A = new int[M + 1];
        int[] B = new int[M + 1];
        for (int i=1; i<M+1;i++) {
            st = new StringTokenizer(buff.readLine());
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }
        G = new ArrayList[N+1];
        for (int i=1;i<N+1;i++) {
            G[i] = new ArrayList<Integer>();
        }

        visited = new boolean[N+1];
        for (int i=1;i<N+1;i++) {
            visited[i] = false;
        }
    }

    public static void dfs(int pos) {
        visited[pos] = true;
        for (int i:G[pos]) {
            visited[i] = true;
            if (visited[i] == false) {
                dfs(i);
            }
        }
    }
}

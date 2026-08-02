package algomath.chap4.sec5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;
/*
그래프가 연결되어있는지 확인하기
깊이 우선 탐색으로 돌았을때 방문 안된 점이 있는지 찾기
p.246
여기는 재귀를 안쓰니까 static으로 정의할 필요가 없음..
 */

public class Code2_stack_try1 {
    public static ArrayList<Integer>[] g;
    public static Stack<Integer> stack;
    public static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(buff.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점 수
        int m = Integer.parseInt(st.nextToken()); // 변 수
        int[] a = new int[m+1];
        int[] b = new int[m+1];
        for (int i=1;i<m+1;i++) {
            st = new StringTokenizer(buff.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }
        g = new ArrayList[n+1];
        for (int i=1;i<n+1;i++) {
            g[i] = new ArrayList<>();
        }
        for (int i=1;i<m+1;i++) {
            g[a[i]].add(b[i]);
            g[b[i]].add(a[i]);
        }
        visited = new boolean[n+1];

        stack = new Stack<>(); // stack이기때문에 dfs임
        stack.push(1);
        while (!stack.isEmpty()) {
            int current = stack.pop();
            for (int next: g[current]) {
                if (!visited[next]) {
                    visited[next] = true;
                    stack.push(next);
                }
            }
        }
        boolean answer = true;
        for (int i=1;i<n+1;i++) {
            if (!visited[i]) {
                answer = false;
            }
        }


    }
}

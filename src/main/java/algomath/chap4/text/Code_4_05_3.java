package algomath.chap4.text;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Code_4_05_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(buff.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] a = new int[m+1];
        int[] b = new int[m+1];
        for (int i=1;i<m+1;i++) {
            st = new StringTokenizer(buff.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer>[] G = new ArrayList[n+1];
        for (int i=1;i<n+1;i++) {
            G[i] = new ArrayList<>();
        }
        for (int i=1;i<m+1;i++) {
            G[a[i]].add(b[i]);
            G[b[i]].add(a[i]);
        }
        int[] dist = new int[n+1];
        for (int i=1;i<n+1;i++) {
            dist[i] = -1;
        }
        Queue<Integer> queue = new LinkedList<>();
        dist[1] = 0;
        queue.add(1);
        while(!queue.isEmpty()) {
            int pos = queue.poll();
            for (int next: G[pos]) {
                if (dist[next] == -1) {
                    dist[next] = dist[pos] + 1;
                    queue.add(next);
                }
            }
        }
        for (int i=1;i<n+1;i++) {
            System.out.println(dist[i]);
        }
    }
}

package algomath.chap4.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Prob_4_5_6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(); // row개수
        int C = sc.nextInt(); // column 개수
        int sy = sc.nextInt(); // 시작 지점의 y좌표 (=row순번)
        int sx = sc.nextInt(); // 시작 지점의 x좌표 (=column순번)
        int gy = sc.nextInt();
        int gx = sc.nextInt();
        String[] c = new String[R+1];
        for (int i=1;i<R+1;i++) {
            c[i] = sc.next();
        }
        ArrayList<Integer>[] G = new ArrayList[R*C+1];
        for (int i=1;i<R*C+1;i++) {
            G[i] = new ArrayList<>();
        }
        // 가로 엣지 등록
        for (int i=1;i<R+1;i++) {
            for (int j=1;j<C;j++) {
                // 점 두개가 붙어있어야 엣지 하나
                if (c[i].charAt(j-1) == '.' && c[i].charAt(j) == '.') {
                    int idx1 = (i-1)*C + j;
                    int idx2 = (i-1)*C + j+1;
                    G[idx1].add(idx2);
                    G[idx2].add(idx1);
                }
            }
        }
        // 세로 엣지 등록
        for (int i=1;i<R;i++) {
            for (int j=1;j<C+1;j++) {
                if (c[i].charAt(j-1) == '.' && c[i+1].charAt(j-1) == '.') {
                    int idx1 = (i-1)*C + j;
                    int idx2 = i*C + j;
                    G[idx1].add(idx2);
                    G[idx2].add(idx1);
                }
            }
        }
        int[] dist = new int[R*C+1];
        for (int i=1;i<R*C+1;i++) {
            dist[i] = -1;
        }
        int startIdx = (sy-1)*C + sx;
        int goalIdx = (gy-1)*C + gx;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startIdx);
        dist[startIdx] = 0;
        while (!queue.isEmpty()) {
            int cur = queue.remove();
            for (int next: G[cur]) {
                if (dist[next] == -1) {
                    dist[next] = dist[cur] + 1;
                    queue.add(next);
                }
            }
        }
        System.out.println(dist[goalIdx]);

    }
}

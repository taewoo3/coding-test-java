package algomath.chap4.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// p.255
public class Prob_4_5_5 {
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
            if (a[i] < b[i]) {
                G[b[i]].add(a[i]);
            } else if (b[i] < a[i]) {
                G[a[i]].add(b[i]);
            }
        }
        int count = 0;
        for (int i=1;i<n+1;i++) {
            if (G[i].size() == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}

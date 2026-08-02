package algomath.chap4.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob_4_2_2 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(buff.readLine());
        int n = Integer.parseInt(buff.readLine());
        int[] left = new int[n+1];
        int[] right = new int[n+1];
        for (int i=1;i<n+1;i++) {
            st = new StringTokenizer(buff.readLine());
            left[i] = Integer.parseInt(st.nextToken());
            right[i] = Integer.parseInt(st.nextToken());
        }
        int[] cha = new int[t+1]; // cha[i] i + 0.5시에 출근해있는 사람수 - (i-1) + 0.5시에 출근한 사람 수
        // 시작은 cha[0] = 0.5시에 출근한 사람수
        // cha[1] = 1.5시 - 0.5시, ,,, cha[t-1] = t-0.5시 - t-1.5시, cha[t]= t+0.5시(= 0) - t-0.5시
        for (int i=1;i<n+1;i++) {
            cha[left[i]]+=1;
            cha[right[i]]-=1;
        }
        long sum = 0;
        for (int i=0;i<t;i++) {
            sum += cha[i];
            System.out.println(sum);
        }
    }
}

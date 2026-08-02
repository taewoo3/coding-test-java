package algomath.chap2.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code_2_04_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1; i<n+1; i++) {
            a[i] = sc.nextInt();
        }
        int[] dp = new int[s+1];

        for (int i=0; i<s+1;i++) {
            dp[i] = 0;
        }
        dp[0] = 1;
        List<Integer> updates = new ArrayList<>();
        // a0,a1... an 까지 돌면서 0~S중에 만들수 있는 값들을 업데이트한다.
        // update할 수 있는 값들을 바로바로 업데이트하면 오답됨
        // ak를 포함시키면서 업데이트할 수 있는 값들을 모았다가 한번에 업데이트해야됨
        for (int i=1; i<n+1; i++) {
            for (int j=0; j<s+1;j++) {
                if (dp[j] == 1) {
                    if (j + a[i] <= s) {
                        updates.add(j+a[i]);
                    }
                }
            }
            for (int k=0; k<updates.size();k++) {
                dp[updates.get(k)] = 1;
            }
        }

        if (dp[s] == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

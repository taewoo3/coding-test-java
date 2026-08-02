package algomath.chap3.text;
// 이진 탐색(binary search), p. 181
// while문 탈출 조건 어려웠음.
import java.util.Arrays;
import java.util.Scanner;

public class Code_3_08_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int left = 0;
        int right = n-1;
        String answer = "No";
        while(left <= right) { //
            int mid = (left + right) / 2;
            if (x == a[mid]) {
                answer = "Yes";
                break;
            } else if (x < a[mid]) {
                right = mid -1;
            } else {
                left = mid+1;
            }
        }
        System.out.println(answer);
    }
}

package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1920_yuseonjun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arrN = new int[N];

        for (int i = 0; i < N; i++) {
            arrN[i] = sc.nextInt();
        }

        Arrays.sort(arrN);

        int M = sc.nextInt();
        int[] arrM = new int[M];

        for (int i = 0; i < M; i++) {
            arrM[i] = sc.nextInt();
            System.out.println(search(0, N - 1, arrN, arrM[i]));
        }
    }

    private static int search(int start, int end, int[] arr, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }
}

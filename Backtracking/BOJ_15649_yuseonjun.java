package Backtracking;

import java.util.Scanner;

public class BOJ_15649_yuseonjun {
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new int[M];
        visited = new boolean[N];

        backtracking(N, M, 0);
    }

    static void backtracking(int N, int M, int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                backtracking(N, M, depth + 1);
                visited[i] = false;
            }
        }
    }
}

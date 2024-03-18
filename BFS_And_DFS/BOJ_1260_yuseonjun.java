package BFS_And_DFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1260_yuseonjun {
    static int[][] map;
    static boolean[] visit;
    static Queue<Integer> queue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        visit = new boolean[N + 1];
        map = new int[N + 1][N + 1];

        for (int i = 1; i <= M; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            map[first][second] = map[second][first] = 1;
        }

        dfs(V, N);

        System.out.println();

        Arrays.fill(visit, false);
        bfs(V, N);


    }

    private static void dfs(int start, int N) {
        visit[start] = true;
        System.out.print(start + " ");
        for (int i = 1; i <= N; i++) {
            if (map[start][i] == 1 && !visit[i]) {
                dfs(i, N);
            }
        }
    }

    private static void bfs(int start, int N) {
        queue = new LinkedList<>();
        queue.add(start);
        visit[start] = true;
        System.out.print(start + " ");
        while (!queue.isEmpty()) {
            int idx = queue.poll();

            for (int i = 1; i <= N; i++) {
                if (map[idx][i] == 1 && !visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}

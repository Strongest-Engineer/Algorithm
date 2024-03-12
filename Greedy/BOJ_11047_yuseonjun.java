package Greedy;

import java.util.Scanner;

public class BOJ_11047_yuseonjun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] coins = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            coins[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            if(coins[i] <= K){
                int num = K / coins[i];
                count += num;
                K -= num * coins[i];
            }
        }

        System.out.println(count);
    }
}

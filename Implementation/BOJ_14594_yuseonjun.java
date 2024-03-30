package Implementation;

import java.util.Scanner;

public class BOJ_14594_yuseonjun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        boolean[] brokenWalls = new boolean[N - 1];

        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for (int j = x - 1; j < y - 1; j++) {
                brokenWalls[j] = true;
            }
        }

        int remainingRooms = 1;

        for (boolean isBroken : brokenWalls) {
            if (!isBroken) {
                remainingRooms++;
            }
        }

        System.out.println(remainingRooms);

        scanner.close();
    }
}

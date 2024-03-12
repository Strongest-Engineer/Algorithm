package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_28278_yuseonjun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> stack = new LinkedList<>();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    int x = Integer.parseInt(st.nextToken());
                    stack.addFirst(x);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        result.append("-1\n");
                    } else {
                        result.append(stack.pollFirst()).append("\n");
                    }
                    break;
                case 3:
                    result.append(stack.size()).append("\n");
                    break;
                case 4:
                    result.append(stack.isEmpty() ? "1\n" : "0\n");
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        result.append("-1\n");
                    } else {
                        result.append(stack.getFirst()).append("\n");
                    }
                    break;
            }
        }

        System.out.print(result);
    }
}

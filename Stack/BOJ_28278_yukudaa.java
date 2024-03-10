import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num1; i++) {
            int num2 = sc.nextInt();
            switch (num2) {
                case 1:
                    int n = sc.nextInt();
                    stack.push(n);
                    break;
                case 2:
                    int pop;
                    if (!stack.isEmpty()) {
                        pop = stack.pop();
                    } else {
                        pop = -1;
                    }
                    sb.append(pop).append("\n");
                    break;
                case 3:
                    int size = stack.size();
                    sb.append(size).append("\n");
                    break;
                case 4:
                    int empty;
                    if (!stack.isEmpty()) {
                        empty = 0;
                    } else {
                        empty = 1;
                    }
                    sb.append(empty).append("\n");
                    break;
                case 5:
                    int top;
                    if (!stack.isEmpty()) {
                        top = stack.peek();
                    } else {
                        top = -1;
                    }
                    sb.append(top).append("\n");
                    break;
            }

        }
        System.out.println(sb);

    }
}
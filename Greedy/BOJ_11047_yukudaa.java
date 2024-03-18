import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] coin = new int[num1];
        for (int i = 0; i < num1; i++) {
            coin[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = num1 - 1; i >= 0; i--) {
            if (num2 >= coin[i]) {
                cnt += (num2 / coin[i]);
                num2 = num2 % coin[i];
            }
        }
        System.out.println(cnt);

    }
}
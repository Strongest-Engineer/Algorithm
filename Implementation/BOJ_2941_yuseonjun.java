package Implementation;

import java.util.Scanner;

public class BOJ_2941_yuseonjun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] change = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int count = 0;

        for (int i = 0; i < change.length; i++) {
            while (str.contains(change[i])) {
                count++;
                str = str.replaceFirst(change[i], " ");
            }
        }

        str = str.replace(" ", "");

        System.out.println(count + str.length());
    }
}

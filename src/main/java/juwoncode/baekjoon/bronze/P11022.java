/**
 * no          : 11022
 * title       : A+B - 8
 * description : 횟수 T 만큼 A와 B를 입력받고, A+B를 출력하시오. (Case #T: A + B = C)
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for (int i = 1; i <= count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
        }

        scanner.close();
    }
}

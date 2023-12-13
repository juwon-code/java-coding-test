/**
 * no          : 10950
 * title       : A+B - 3
 * description : 횟수 T 만큼 A와 B를 입력받고, A+B를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }

        scanner.close();
    }
}

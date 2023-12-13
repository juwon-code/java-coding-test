/**
 * no          : 14681
 * title       : 사분면 고르기
 * description : x좌표와 y좌표가 주어질 때, 몇 사분면에 속하는지 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0) {
            System.out.print((y > 0) ? 1 : 4);
        } else {
            System.out.print((y > 0) ? 2 : 3);
        }

        scanner.close();
    }
}

/**
 * no          : 19532
 * title       : 수학은 비대면강의입니다
 * description : 연립 일차방정식이 주어질 때, 만족하는 x와 y를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P19532 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();

        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                int result = (a1 * x) + (b1 * y);
                if (result == c1) {
                    result = (a2 * x) + (b2 * y);
                    if (result == c2) {
                        System.out.print(x + " " + y);
                        break;
                    }
                }
            }
        }

        scanner.close();
    }
}

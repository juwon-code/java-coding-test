/**
 * no          : 2753
 * title       : 윤년
 * description : 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }

        scanner.close();
    }
}

/**
 * no          : 2739
 * title       : 구구단
 * description : N을 입력받아 구구단 N단을 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }

        scanner.close();
    }
}

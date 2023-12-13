/**
 * no          : 1330
 * title       : 두 수 비교하기
 * description : 두 정수 A와 B를 비교하는 프로그램을 작성하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == b) {
            System.out.print("==");
        } else {
            System.out.print((a > b) ? ">" : "<");
        }

        scanner.close();
    }
}

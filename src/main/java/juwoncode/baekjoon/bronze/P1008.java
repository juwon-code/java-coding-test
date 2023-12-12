/**
 * no          : 1008
 * title       : A/B
 * description : 두 정수 A와 B를 입력받고, A/B를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print((double) a / b);
        scanner.close();
    }
}

/**
 * no          : 2908
 * title       : 상수
 * description : 두 자연수가 주어질 때, 자리를 뒤집고 큰 수를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(new StringBuilder(scanner.next()).reverse().toString());
        int number2 = Integer.parseInt(new StringBuilder(scanner.next()).reverse().toString());

        System.out.print(Math.max(number1, number2));
        scanner.close();
    }
}

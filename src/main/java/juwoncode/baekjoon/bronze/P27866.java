/**
 * no          : 27866
 * title       : 문자와 문자열
 * description : 단어 S와 정수 i가 주어질 때, S의 i번째 글자를 출력하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P27866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        int number = scanner.nextInt() - 1;

        System.out.print(string.charAt(number));
        scanner.close();
    }
}

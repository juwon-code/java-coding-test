/**
 * no          : 11654
 * title       : 아스키 코드
 * description : 알파벳 소문자, 대문자, 숫자가 주어질 때, 아스키 코드 값을 출력하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P11654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character = scanner.next().charAt(0);

        System.out.print((int) character);
        scanner.close();
    }
}

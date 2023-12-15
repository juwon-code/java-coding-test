/**
 * no          : 9086
 * title       : 문자열
 * description : 문자열을 입력받고 첫 글자와 마지막 글자를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P9086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            String string = scanner.next();
            char fChar = string.charAt(0);
            char lChar = string.charAt(string.length() - 1);
            System.out.println(fChar + "" + lChar);
        }

        scanner.close();
    }
}

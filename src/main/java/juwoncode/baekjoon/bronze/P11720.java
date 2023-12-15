/**
 * no          : 11720
 * title       : 숫자의 합
 * description : N개의 숫자가 공백 없이 주어질 때, 모두 합하여 출력하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt(), result = 0;
        String string = scanner.next();

        for (int i = 0; i < count; i++) {
            result += Character.getNumericValue(string.charAt(i));
        }

        System.out.print(result);
        scanner.close();
    }
}

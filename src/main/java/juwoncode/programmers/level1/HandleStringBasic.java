/**
 * title : 문자열 다루기 기본
 */

package juwoncode.programmers.level1;

import java.util.Scanner;

public class HandleStringBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextLine()));

        scanner.close();
    }

    public static boolean solution(String string) {
        char[] array = string.toCharArray();
        boolean result = true;

        for (char character : array) {
            if (Character.isAlphabetic(character)) {
                result = false;
                break;
            }
        }

        return result && (string.length() == 4 || string.length() == 6);
    }
}

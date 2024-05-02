/**
 * title : 숫자 문자열과 영단어
 */

package juwoncode.programmers.level1;

import java.util.Scanner;

public class NumberStringAndWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextLine()));

        scanner.close();
    }

    private final static String[] words = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven"
            , "eight", "nine"};

    public static int solution(String string) {
        for (int i = 0; i < words.length; i++) {
            if (string.contains(words[i])) {
                string = string.replaceAll(words[i], String.valueOf(i));
            }
        }

        return Integer.parseInt(string);
    }
}

/**
 * title : JadenCase 문자열 만들기
 */

package juwoncode.programmers.level2;

import java.util.Scanner;

public class MakeJadenCaseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextLine()));

        sc.close();
    }

    public static String solution(String string) {
        char[] characters = string.toCharArray();
        boolean isFirst = true;
        for (int i = 0; i < characters.length; i++) {
            if (Character.isWhitespace(characters[i])) {
                isFirst = true;
            } else if (isFirst) {
                characters[i] = Character.toUpperCase(characters[i]);
                isFirst = false;
            } else {
                characters[i] = Character.toLowerCase(characters[i]);
            }
        }

        return new String(characters);
    }
}

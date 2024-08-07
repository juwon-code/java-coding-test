/**
 * title : 대문자와 소문자
 */

package juwoncode.programmers.level0;

public class UppercaseAndLowercase {
    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
        System.out.println(solution("abCdEfghIJ"));
    }

    public static String solution(String my_string) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char character = my_string.charAt(i);

            character = (Character.isUpperCase(character)) ?
                    Character.toLowerCase(character) : Character.toUpperCase(character);

            stringBuilder.append(character);
        }

        return stringBuilder.toString();
    }
}

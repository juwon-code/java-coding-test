/**
 * title : 암호 해독
 */

package juwoncode.programmers.level0;

public class Descryption {
    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(solution("pfqallllabwaoclk", 2));
    }

    public static String solution(String cipher, int code) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = code; i <= cipher.length(); i += code) {
            stringBuilder.append(cipher.charAt(i - 1));
        }

        return stringBuilder.toString();
    }
}

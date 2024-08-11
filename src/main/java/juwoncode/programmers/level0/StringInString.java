/*
    title : 문자열안에 문자열
 */

package juwoncode.programmers.level0;

public class StringInString {
    public static void main(String[] args) {
        System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println(solution("ppprrrogrammers", "pppp"));
        System.out.println(solution("AbcAbcA", "AAA"));
    }

    public static int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}

/**
 * title : 문자 개수 세기
 */

package juwoncode.programmers.level0;

public class CountCharacters {
    public int[] solution(String string) {
        int[] counts = new int[52];

        char[] characters = string.toCharArray();
        for (char character : characters) {
            if (character >= 'A' && character <= 'Z') {
                counts[character - 'A']++;
            } else {
                counts[26 + character - 'a']++;
            }
        }

        return counts;
    }
}

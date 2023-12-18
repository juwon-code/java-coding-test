/**
 * no          : 1157
 * title       : 단어 공부
 * description : 대소문자로 이루어진 문자열이 주어질 때, 대소문자를 무시하고 가장 많이 사용된 알파벳의 개수를 출력하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] alphabets = new int[26];
        char[] characters = scanner.next().toUpperCase().toCharArray();

        for (char character : characters) {
            alphabets[character - 65]++;
        }

        int index = -1, maxCount = 0;
        boolean isDuplicated = false;
        for (int i = 0; i < alphabets.length; i++) {
            int currCount = alphabets[i];
            if (currCount == 0) {
                continue;
            }
            if (currCount == maxCount) {
                isDuplicated = true;
            }
            if (currCount > maxCount) {
                maxCount = currCount;
                index = i;
                isDuplicated = false;
            }
        }

        System.out.print((isDuplicated) ? "?" : (char)(index + 65));
        scanner.close();
    }
}

/**
 * no          : 10809
 * title       : 알파벳 찾기
 * description : 알파벳 소문자로만 이루어진 단어 S가 주어질 때, 각각의 알파벳에 대해서, 처음 등장하는 위치를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class P10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);
        char[] characters = scanner.next().toCharArray();

        for (int i = 0; i < characters.length; i++) {
            int index = characters[i] - 97;
            if (alphabets[index] == -1) {
                alphabets[index] = i;
            }
        }

        for (int alphabet : alphabets) {
            System.out.print(alphabet + " ");
        }

        scanner.close();
    }
}

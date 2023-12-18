/**
 * no          : 1316
 * title       : 그룹 단어 체커
 * description : 그룹 단어란 문자가 연속해서 나타나는 단어를 말한다. 단어를 N개 입력받아 그룹 단어의 개수를 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.util.Scanner;

public class P1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int COUNT = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < COUNT; i++) {
            String string = scanner.next();
            String _string = string;

            boolean isGroup = true;
            for (int j = 0; j < _string.length(); j++) {
                _string = _string.replaceAll(_string.charAt(j) + "+", "A");
                if (_string.indexOf("A") != _string.lastIndexOf("A")) {
                    isGroup = false;
                    break;
                }
                _string = string;
            }

            if (isGroup) {
                result++;
            }
        }

        System.out.print(result);
        scanner.close();
    }
}

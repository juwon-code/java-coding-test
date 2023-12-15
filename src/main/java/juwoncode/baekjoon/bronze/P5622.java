/**
 * no          : 5622
 * title       : 다이얼
 * description : 두 자연수가 주어질 때, 자리를 뒤집고 큰 수를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P5622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String[] templates = {"", "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String[] strings = scanner.next().split("");

        int result = 0;
        for (String string : strings) {
            for (int i = 0; i < templates.length; i++) {
                if (templates[i].contains(string)) {
                    result += i;
                    break;
                }
            }
        }

        System.out.print(result);
        scanner.close();
    }
}

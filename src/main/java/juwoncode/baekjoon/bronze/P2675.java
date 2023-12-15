/**
 * no          : 2675
 * title       : 문자열 반복
 * description : 문자열 S를 입력받고, 각 문자를 R번 반복하여 출력하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            StringBuilder sb = new StringBuilder();
            int times = scanner.nextInt();
            String[] strings = scanner.next().split("");
            for (String string : strings) {
                for (int j = 0; j < times; j++) {
                    sb.append(string);
                }
            }
            System.out.println(sb);
        }

        scanner.close();
    }
}

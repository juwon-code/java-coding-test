/**
 * no          : 2444
 * title       : 별 찍기 - 7
 * description : 자연수 N이 주어질 때, 2×N-1 줄까지 별을 출력하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2444 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int maxLine = 2 * number - 1;
        StringBuilder template = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLine; i++) {
            template.append("*");
        }
        result.append(template + "\n");

        for (int i = 1; i < number; i++) {
            template.replace(i - 1, i, " ");
            template.deleteCharAt(template.length() - 1);
            result.insert(0, template + "\n");
            result.append(template + "\n");
        }

        System.out.print(result);
        scanner.close();
    }
}

/**
 * no          : 1152
 * title       : 단어의 개수
 * description : 대소문자와 공백으로 이루어진 문자열이 주어질 때, 단어의 개수를 출력하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class P1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long count = Arrays.stream(scanner.nextLine().trim().split(" "))
                .filter(e -> !e.equals("")).count();

        System.out.println(count);
        scanner.close();
    }
}

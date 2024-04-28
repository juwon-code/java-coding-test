/**
 * title : 문자열 내림차순으로 배치하기
 */

package juwoncode.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortStringReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextLine()));

        scanner.close();
    }

    public static String solution(String string) {
        String[] array = string.split("");

        Arrays.sort(array, Comparator.reverseOrder());

        return String.join("", array);
    }
}

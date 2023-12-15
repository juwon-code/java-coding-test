/**
 * no          : 1546
 * title       : 평균
 * description : 성적을 입력받고, 개별점수 / 최고점수 * 100로 수정하여 평균을 구하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class P1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] values = new int[count];

        for (int i = 0; i < count; i++) {
            values[i] = scanner.nextInt();
        }

        int max = Arrays.stream(values).max().getAsInt();
        double result = Arrays.stream(values)
                .mapToDouble(e -> calculate(e, max)).average().getAsDouble();

        System.out.print(result);
        scanner.close();
    }

    private static double calculate(int value, int max) {
        return (double) value / max * 100;
    }
}

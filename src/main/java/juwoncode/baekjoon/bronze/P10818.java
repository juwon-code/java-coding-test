/**
 * no          : 10818
 * title       : 최소, 최대
 * description : N개의 정수가 주어질 때, 최솟값과 최댓값을 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int max = -1000001, min = 1000001;

        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.print(min + " " + max);
        scanner.close();
    }
}

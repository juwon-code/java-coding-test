/**
 * no          : 10807
 * title       : 개수 세기
 * description : N개의 정수가 주어졌을 때, 정수 V가 몇 개인지 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class P10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int find = scanner.nextInt();
        int count = (int) Arrays.stream(numbers).filter(number -> number == find).count();

        System.out.print(count);
        scanner.close();
    }
}

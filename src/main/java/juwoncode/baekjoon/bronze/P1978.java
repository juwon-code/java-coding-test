/**
 * no          : 1978
 * title       : 소수 찾기
 * description : 주어진 N개의 수 중에서 소수의 개수를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int result = 0;
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            int divisorCount = (int) IntStream.range(1, number).filter(j -> number % j == 0).count();
            if (divisorCount == 1) {
                result++;
            }
        }

        System.out.print(result);
        scanner.close();
    }
}

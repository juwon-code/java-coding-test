/**
 * no          : 2581
 * title       : 소수
 * description : 자연수 M과 N이 주어질 때, M이상 N이하 자연수 중 소수를 찾고 소수의 합과 최솟값을 출력하시오. (없을 경우 -1 출력)
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P2581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int min = -1, sum = 0;
        for (int i = m; i <= n; i++) {
            int number = i;
            int count = (int) IntStream.range(1, i).filter(j -> number % j == 0).count();
            if (count == 1) {
                if (min == -1) {
                    min = number;
                }
                sum += number;
            }
        }


        System.out.print((min == -1) ? min : sum + "\n" + min);

        scanner.close();
    }
}

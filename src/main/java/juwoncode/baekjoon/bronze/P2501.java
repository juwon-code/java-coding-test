/**
 * no          : 2501
 * title       : 약수 구하기
 * description : 자연수 N과 K가 주어질 때, N의 약수 중에 K 번째로 작은 수를 출력하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int rank = scanner.nextInt();

        int curr = 0, result = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                curr++;
            }

            if (curr == rank) {
                result = i;
                break;
            }
        }

        System.out.print(result);
        scanner.close();
    }
}

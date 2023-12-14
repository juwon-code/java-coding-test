/**
 * no          : 2562
 * title       : 최댓값
 * description : 9개의 서로 다른 자연수가 주어질 때, 최댓값이 몇 번째 수인지 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = -1, index = -1;

        for (int i = 1; i <= 9; i++) {
            int number = scanner.nextInt();
            if (number > max) {
                max = number;
                index = i;
            }
        }

        System.out.print(max + "\n" + index);
        scanner.close();
    }
}

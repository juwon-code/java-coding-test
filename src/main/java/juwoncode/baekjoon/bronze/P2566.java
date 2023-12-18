/**
 * no          : 2566
 * title       : 최댓값
 * description : 9×9 행렬이 주어진다. 최댓값의 위치를 찾고, 첫 줄에는 값을 둘째 줄에는 행과 열을 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2566 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int LENGTH = 9;
        int col = 1, row = 1, max = 0;

        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        System.out.print(max + "\n" + row + " " + col);
        scanner.close();
    }
}

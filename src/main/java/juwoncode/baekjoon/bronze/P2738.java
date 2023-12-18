/**
 * no          : 2738
 * title       : 행렬 덧셈
 * description : N*M 크기의 행렬을 2개 입력받고 더하여 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2738 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    matrix[j][k] += scanner.nextInt();
                }
            }
        }

        for (int[] _matrix : matrix) {
            for (int value : _matrix) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

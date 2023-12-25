/**
 * no          : 3009
 * title       : 네 번째 점
 * description : 세 점이 주어졌을 때 직사각형을 만들기 위해 필요한 네 번째 점을 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P3009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] dots = new int[3][2];
        int temp;

        for (int i = 0; i < 3; i++) {
            dots[i][0] = scanner.nextInt();
            dots[i][1] = scanner.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            if (dots[0][i] == dots[1][i]) {
                temp = dots[2][i];
            } else if (dots[0][i] == dots[2][i]) {
                temp = dots[1][i];
            } else {
                temp = dots[0][i];
            }
            System.out.print(temp + " ");
        }

        scanner.close();
    }
}

/**
 * no          : 10798
 * title       : 세로읽기
 * description : 5줄에 최대 15자의 문자를 입력받는다. 문자를 세로로 읽고 공백없이 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P10798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int LENGTH = 15, COUNT = 5;
        String[][] array = new String[LENGTH][LENGTH];

        for (int i = 0; i < COUNT; i++) {
            String[] string = scanner.next().split("");
            for (int j = 0; j < string.length; j++) {
                array[i][j] = string[j];
            }
        }

        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (array[j][i] != null) {
                    System.out.print(array[j][i]);
                }
            }
        }

        scanner.close();
    }
}

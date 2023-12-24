/**
 * no          : 27323
 * title       : 직사각형
 * description : 세로 길이가 A, 가로 길이가 B인 직사각형의 넓이를 구하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P27323 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int w = scanner.nextInt();

        System.out.print(h * w);
        scanner.close();
    }
}

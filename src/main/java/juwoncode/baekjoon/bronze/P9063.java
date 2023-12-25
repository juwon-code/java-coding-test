/**
 * no          : 9063
 * title       : 대지
 * description : 개수 N 만큼 점의 좌표가 하나씩 주어질 때, 점을 둘러싸는 최소 크기의 직사각형 넓이를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P9063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] xs = new int[count];
        int[] ys = new int[count];

        for (int i = 0; i < count; i++) {
            xs[i] = scanner.nextInt();
            ys[i] = scanner.nextInt();
        }

        int minX = 10000, maxX = -10000, minY = 10000, maxY = -10000;
        for (int i = 0; i < count; i++) {
            if (xs[i] > maxX) {
                maxX = xs[i];
            }
            if (xs[i] < minX) {
                minX = xs[i];
            }
            if (ys[i] > maxY) {
                maxY = ys[i];
            }
            if (ys[i] < minY) {
                minY = ys[i];
            }
        }

        System.out.print((maxX - minX) * (maxY - minY));
        scanner.close();
    }
}

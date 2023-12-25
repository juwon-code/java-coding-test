/**
 * no          : 1085
 * title       : 직사각형에서 탈출
 * description : 직사각형의 왼쪽 아래 꼭짓점(0, 0), 오른쪽 위 꼭짓점(w, h)이 주어질 때, 직사각형 내부의 점(x, y)와 경계선의 최단거리를 구하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        System.out.print(Math.min(Math.min((w - x), x), Math.min((h - y), y)));
        scanner.close();
    }
}

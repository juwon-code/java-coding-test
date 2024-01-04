/**
 * no          : 2903
 * title       : 중앙 이동 알고리즘
 * description : 다음 규칙에 따라서 횟수 N만큼 반복할 때, 점의 개수를 출력하라.
 *      (1) 정사각형의 각 변의 중앙에 점을 하나 추가한다.
 *      (2) 정사각형의 중심에 점을 하나 추가한다.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2903 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int result = 0, number = 2;
        for (int i = 0; i < count; i++) {
            result = 1 + number;
            number *= 2;
        }

        System.out.print((int) Math.pow(result, 2));
        scanner.close();
    }
}

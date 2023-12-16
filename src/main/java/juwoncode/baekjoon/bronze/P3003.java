/**
 * no          : 3003
 * title       : 킹, 퀸, 룩, 비숍, 나이트, 폰
 * description : 체스는 각 말이 (1, 1, 2, 2, 2, 8)로 주어진다. 배열이 하나 주어질 때 부족하거나 남는 피스의 개수를 구하고 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] templates = new int[]{1, 1, 2, 2, 2, 8};

        for (int template : templates) {
            int result = template - scanner.nextInt();
            System.out.print(result + " ");
        }

        scanner.close();
    }
}

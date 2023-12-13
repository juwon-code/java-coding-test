/**
 * no          : 2439
 * title       : 별 찍기 - 2
 * description : 첫째 줄에는 별 1개, N번째 줄에는 별 N개를 오른쪽으로 정렬하여 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(" ");
        }

        for (int i = count; i > 0; i--) {
            sb.replace(i - 1, i, "*");
            System.out.println(sb);
        }

        scanner.close();
    }
}

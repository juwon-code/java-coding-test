/**
 * no          : 2438
 * title       : 별 찍기 - 1
 * description : 첫째 줄에는 별 1개, N번째 줄에는 별 N개를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            sb.append("*");
            System.out.println(sb);
        }

        scanner.close();
    }
}

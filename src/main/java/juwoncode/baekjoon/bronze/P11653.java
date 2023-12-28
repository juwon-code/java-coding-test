/**
 * no          : 11653
 * title       : 소인수분해
 * description : 정수 N이 주어질 때, 소인수분해를 수행하고 결과를 하나씩 출력하는 프로그램을 작성하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P11653 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n == 1) {
            System.exit(0);
        }

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n /= i;
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

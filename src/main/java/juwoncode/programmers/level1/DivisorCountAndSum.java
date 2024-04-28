/**
 * title : 약수의 개수와 덧셈
 */

package juwoncode.programmers.level1;

import java.util.Scanner;

public class DivisorCountAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextInt(), scanner.nextInt()));

        scanner.close();
    }

    public static int solution(int left, int right) {
        int result = 0;

        for (int i = left; i <= right; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            result += (count % 2 == 0) ? i : -i;
        }

        return result;
    }
}

/**
 * title : 숫자의 표현
 */

package juwoncode.programmers.level2;

import java.util.Scanner;

public class ExpressionOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextInt()));

        sc.close();
    }

    public static int solution(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            int sum = 0;
            for (int j = i; j <= number; j++) {
                sum += j;
                if (sum >= number) {
                    break;
                }
            }
            if (sum == number) {
                count++;
            }
        }

        return count;
    }
}

/**
 * no          : 5086
 * title       : 배수와 약수
 * description : 두 수가 주어질 때 다음 조건에 따라 결과를 출력하라.
 *      (1) 첫 번째 숫자가 두 번째 숫자의 약수이다. (factor)
 *      (2) 첫 번째 숫자가 두 번째 숫자의 배수이다. (multiple)
 *      (3) 첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다. (neither)
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P5086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            if (number1 == 0 && number2 == 0) {
                break;
            }

            if (number1 > number2) {
                System.out.println((number1 % number2 == 0) ? "multiple" : "neither");
                continue;
            }

            if (number1 < number2) {
                System.out.println((number2 % number1 == 0) ? "factor" : "neither");
                continue;
            }
        }

        scanner.close();
    }
}

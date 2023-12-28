/**
 * no          : 9506
 * title       : 약수들의 합
 * description : 숫자 n을 입력받고 다음 조건에 따라서 출력하라.
 *      (1) n이 완전수일 경우, "n = 약수 + 약수 + 약수" 형식으로 출력하라.
 *      (2) n이 완전수가 아닐 경우, "n is NOT perfect."를 출력하라.
 *      (3) n이 -1일 경우 프로그램을 종료한다.
 */

package juwoncode.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P9506 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            StringBuilder sb = new StringBuilder(number + " ");
            int[] divisors = IntStream.range(1, number).filter(value -> number % value == 0).toArray();
            if (Arrays.stream(divisors).sum() == number) {
                sb.append("= ");
                for (int divisor : divisors) {
                    sb.append(divisor + " + ");
                }
                sb.delete(sb.length() - 3, sb.length() - 1);
            } else {
                sb.append("is NOT perfect.");
            }

            System.out.println(sb);
        }

        scanner.close();
    }
}

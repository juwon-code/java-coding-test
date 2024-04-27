/**
 * title : 두 정수 사이의 합
 */

package juwoncode.programmers.level1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextInt(), scanner.nextInt()));

        scanner.close();
    }

    public static long solution(int number1, int number2) {
        return IntStream.rangeClosed(Math.min(number1, number2), Math.max(number1, number2)).mapToLong(i -> (long) i).sum();
    }
}

/**
 * title : 약수의 합
 */

package juwoncode.programmers.level1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextInt()));

        scanner.close();
    }

    public static int solution(int number) {
        return IntStream.rangeClosed(1, number).filter(i -> number % i == 0).sum();
    }
}

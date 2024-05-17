/**
 * title : 피보나치 수
 */

package juwoncode.programmers.level2;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextInt()));

        sc.close();
    }

    public static int solution(int number) {
        return fibonacci(number);
    }

    // 동적 계획법.
    private static int fibonacci(int number) {
        int[] array = new int[number + 1];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= number; i++) {
            array[i] = (array[i - 1] + array[i - 2]) % 1234567;
        }

        return array[number];
    }
}

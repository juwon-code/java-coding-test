/**
 * title : 정수 제곱근 판별
 */

package juwoncode.programmers.level1;

import java.util.Scanner;

public class CheckSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextLong()));

        scanner.close();
    }

    public static long solution(long number) {
        double result = Math.sqrt(number);

        return result > Math.floor(result) ? -1 : (long) Math.pow(result + 1, 2);
    }
}

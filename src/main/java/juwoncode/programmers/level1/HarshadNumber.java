/**
 * title : 하샤드 수
 */

package juwoncode.programmers.level1;

import java.util.Arrays;
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextInt()));

        scanner.close();
    }

    public static boolean solution(int number) {
        int harshad = Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).sum();

        return number % harshad == 0;
    }
}

/**
 * title : 짝수와 홀수
 */

package juwoncode.programmers.level1;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextInt()));

        scanner.close();
    }

    public static String solution(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}

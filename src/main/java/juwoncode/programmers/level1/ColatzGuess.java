/**
 * title : 콜라츠 추측
 */

package juwoncode.programmers.level1;

import java.util.Scanner;

public class ColatzGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextInt()));

        scanner.close();
    }

    public static int solution(int number) {
        long _number = number;
        int result = 0;

        while (_number != 1) {
            if (result == 500) {
                break;
            }

            if (_number % 2 == 0) {
                _number /= 2;
            } else {
                _number = _number * 3 + 1;
            }

            result++;
        }

        return result == 500 ? -1 : result;
    }
}

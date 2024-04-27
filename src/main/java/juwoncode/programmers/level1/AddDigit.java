/**
 * title : 자릿수 더하기
 */

package juwoncode.programmers.level1;

import java.util.Arrays;
import java.util.Scanner;

public class AddDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextInt()));

        scanner.close();
    }

    public static int solution(int number) {
        return Arrays.stream(Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt).toArray()).sum();
    }
}

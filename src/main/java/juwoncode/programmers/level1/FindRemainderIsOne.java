/**
 * title : 나머지가 1이 되는 수 찾기
 */

package juwoncode.programmers.level1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FindRemainderIsOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextInt()));

        scanner.close();
    }

    public static int solution(int number) {
        return IntStream.range(1, number).filter(i -> number % i == 1).findFirst().getAsInt();
    }
}

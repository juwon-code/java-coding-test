/**
 * title : 수박수박수박수박수박수?
 */

package juwoncode.programmers.level1;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WaterMellon {
    private static final String WATER = "수";
    private static final String MELLON = "박";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextInt()));

        scanner.close();
    }

    public static String solution(int number) {
        return IntStream.rangeClosed(1, number)
                .mapToObj(i -> i % 2 != 0 ? WATER : MELLON)
                .collect(Collectors.joining());
    }
}

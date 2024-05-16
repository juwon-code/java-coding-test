/**
 * title : 최댓값과 최솟값
 */

package juwoncode.programmers.level2;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextLine()));

        sc.close();
    }

    public static String solution(String string) {
        int[] array = Arrays.stream(string.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maximum = Integer.MIN_VALUE, minimum = Integer.MAX_VALUE;

        for (int number : array) {
            if (maximum < number) {
                maximum = number;
            }
            if (minimum > number) {
                minimum = number;
            }
        }

        return String.format("%d %d", minimum, maximum);
    }
}

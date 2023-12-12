/**
 * no          : 2588
 * title       : 곱셈
 * description : 아래와 같은 곱셈 과정에서 (3) ~ (6)에 해당하는 값을 출력하라.
 *      (ex)  4 7 2 --- (1)
 *          * 3 8 5 --- (2)
 *      -----------
 *          2 3 6 0 --- (3)
 *        3 7 7 6   --- (4)
 *      1 4 1 6     --- (5)
 *      -----------
 *      1 8 1 7 2 0 --- (6)
 */

package juwoncode.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class P2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int[] array = Arrays.stream(String.valueOf(number2).split(""))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(number1 * array[i]);
        }
        System.out.print(number1 * number2);
        scanner.close();
    }
}

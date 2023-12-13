/**
 * no          : 8393
 * title       : 합
 * description : n이 주어졌을 때, 1부터 n까지 합을 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int total = IntStream.rangeClosed(1, n).sum();

        System.out.print(total);
        scanner.close();
    }
}

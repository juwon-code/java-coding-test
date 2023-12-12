/**
 * no          : 11382
 * title       : 꼬마 정민
 * description : A, B, C를 입력받고 더하여 출력한다.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P11382 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        System.out.print(a + b + c);
        scanner.close();
    }
}

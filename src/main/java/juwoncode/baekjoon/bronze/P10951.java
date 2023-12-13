/**
 * no          : 10951
 * title       : A+B - 4
 * description : 두 정수 A와 B를 입력받고, A+B를 출력하시오. (EOF)
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }

        scanner.close();
    }
}

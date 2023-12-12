/**
 * no          : 10869
 * title       : 사칙연산
 * description : 두 정수 A와 B를 입력받고, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P10869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        scanner.close();
    }
}

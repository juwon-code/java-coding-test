/**
 * no          : 10430
 * title       : 나머지
 * description : 세 수 A, B, C가 주어지는데, 다음 네 가지 식의 값을 구하시오.
 *      (1) "(A+B)%C"
 *      (2) "((A%C) + (B%C))%C"
 *      (3) "(A×B)%C"
 *      (4) "((A%C) × (B%C))%C"
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P10430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.print(((a % c) * (b % c)) % c);
        scanner.close();
    }
}

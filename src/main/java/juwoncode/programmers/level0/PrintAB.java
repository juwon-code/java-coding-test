/**
 * title : a와 b 출력하기
 */

package juwoncode.programmers.level0;

import java.util.Scanner;

public class PrintAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("a = %d\nb = %d%n", a, b);
        sc.close();
    }
}

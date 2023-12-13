/**
 * no          : 10952
 * title       : A+B - 5
 * description : 두 정수 A와 B를 입력받고, A+B를 출력하시오. 단, A=0, B=0일 경우 프로그램을 종료하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
                break;
            } else {
                System.out.println(a + b);
            }
        }

        scanner.close();
    }
}

/**
 * no          : 11718
 * title       : 그대로 출력하기
 * description : 입력받은 문자열을 출력하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P11718 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}

/**
 * title : 문자열 붙여서 출력하기
 */

package juwoncode.programmers.level0;

import java.util.Scanner;

public class PrintStringAttach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.printf("%s%s", a, b);
        sc.close();
    }
}

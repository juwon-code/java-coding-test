/**
 * no          : 10926
 * title       : ??!
 * description : 문자열을 입력받고, "??!을 붙여서 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P10926 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        System.out.print(string + "??!");
        scanner.close();
    }
}

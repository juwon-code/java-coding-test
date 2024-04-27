/**
 * title : 문자열을 정수로 바꾸기
 */

package juwoncode.programmers.level1;

import java.util.Scanner;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextLine()));

        scanner.close();
    }

    public static int solution(String string) {
        return Integer.parseInt(string);
    }
}

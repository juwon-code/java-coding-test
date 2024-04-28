/**
 * title : 핸드폰 번호 가리기
 */

package juwoncode.programmers.level1;

import java.util.Scanner;

public class HidePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextLine()));

        scanner.close();
    }

    public static String solution(String phone) {
        StringBuilder sb = new StringBuilder(phone);

        return sb.replace(0, phone.length() - 4, "*".repeat(phone.length() - 4)).toString();
    }
}

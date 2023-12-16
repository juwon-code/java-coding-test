/**
 * no          : 10988
 * title       : 팰린드롬인지 확인하기
 * description : 알파벳 소문자로 이루어진 단어가 주어질 때, 팰린드롬이면 1을 아니라면 0을 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder string = new StringBuilder(scanner.next());

        int result = 1;
        while(string.length() > 1) {
            if (string.charAt(0) == string.charAt(string.length()-1)) {
                string.deleteCharAt(0);
                string.deleteCharAt(string.length()-1);
            }else {
                result = 0;
                break;
            }
        }

        System.out.print(result);
        scanner.close();
    }
}

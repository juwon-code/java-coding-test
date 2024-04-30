/**
 * title : 크기가 작은 부분 문자열
 */

package juwoncode.programmers.level1;

import java.util.Scanner;

public class SmallSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextLine(), sc.nextLine()));

        sc.close();
    }

    public static int solution(String string, String substring) {
        int fLength = string.length(), sLength = substring.length(), result = 0;
        long sLong = Long.parseLong(substring);

        for (int i = 0; i <= fLength - sLength; i++) {
            long temp = Long.parseLong(string.substring(i, i + sLength));

            if (temp <= sLong) {
                result++;
            }
        }

        return result;
    }
}

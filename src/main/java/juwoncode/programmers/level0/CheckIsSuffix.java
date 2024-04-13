/**
 * title : 접미사인지 확인하기
 */

package juwoncode.programmers.level0;

import java.util.Scanner;

public class CheckIsSuffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        String check = sc.nextLine();
        System.out.println(solution(string, check));

        sc.close();
    }

    public static int solution(String string, String check) {
        boolean isSuffix = false;

        for (int i = 0; i < string.length(); i++) {
            String suffix = string.substring(i);
            if (suffix.equals(check)) {
                isSuffix = true;
                break;
            }
        }

        return isSuffix ? 1 : 0;
    }
}

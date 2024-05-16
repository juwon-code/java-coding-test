/**
 * title : 올바른 괄호
 */

package juwoncode.programmers.level2;

import java.util.Scanner;

public class CorrectParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextLine()));

        sc.close();
    }

    public static boolean solution(String string) {
        String[] symbols = string.split("");
        int opCount = 0, clCount = 0;

        for (String symbol : symbols) {
            if (symbol.equals("(")) {
                opCount++;
            } else {
                clCount++;
            }
            if (opCount < clCount) {
                break;
            }
        }

        return opCount == clCount;
    }
}

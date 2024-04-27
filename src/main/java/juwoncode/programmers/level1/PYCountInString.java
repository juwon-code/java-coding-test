/**
 * title : 문자열 내 p와 y의 개수
 */

package juwoncode.programmers.level1;

import java.util.Scanner;

public class PYCountInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextLine()));

        scanner.close();
    }

    public static boolean solution(String string) {
        String[] array = string.split("");

        int pCount = 0, yCount = 0;
        for (String element : array) {
            if (element.equalsIgnoreCase("p")) {
                pCount++;
                continue;
            }
            if (element.equalsIgnoreCase("y")) {
                yCount++;
            }
        }

        return pCount == yCount;
    }
}

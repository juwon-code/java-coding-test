/**
 * title : 이상한 문자 만들기
 */

package juwoncode.programmers.level1;

import java.util.Scanner;

public class MakeStrangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextLine()));

        sc.close();
    }

    public static String solution(String string) {
        String[] array = string.split("");

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(" ")) {
                index = 0;
                continue;
            }

            if (index % 2 == 0) {
                array[i] = array[i].toUpperCase();
            } else {
                array[i] = array[i].toLowerCase();
            }
            index++;
        }

        return String.join("", array);
    }
}

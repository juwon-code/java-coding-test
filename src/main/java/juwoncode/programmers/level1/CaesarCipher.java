/**
 * title : 시저 암호
 */

package juwoncode.programmers.level1;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        int number = sc.nextInt();
        System.out.print(solution(string, number));

        sc.close();
    }

    public static String solution(String string, int number) {
        char[] array = string.toCharArray();
        int size = "abcdefghijklmnopqrstuvwxyz".length();

        for (int i = 0; i < array.length; i++) {
            if (Character.isLowerCase(array[i])) {
                array[i] = (char) ((array[i] + number - 'a') % size + 'a');
                continue;
            }
            if (Character.isUpperCase(array[i])) {
                array[i] = (char) ((array[i] + number - 'A') % size + 'A');
            }
        }

        return new String(array);
    }
}

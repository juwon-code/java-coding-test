/**
 * no          : 2941
 * title       : 크로아티아 알파벳
 * description : 크로아티아 알파벳 (c=, c-, dz=, d-, lj, nj, s=, z=)을 포함하는 문자열의 총 알파벳의 개수를 구하라.
 */

package juwoncode.baekjoon.silver;

import java.util.Scanner;

public class P2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String[] croatians = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String string = scanner.next();

        for (String croatian : croatians) {
            string = string.replaceAll(croatian, " ");
        }

        System.out.print(string.length());
        scanner.close();
    }
}

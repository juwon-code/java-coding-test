/**
 * title : 대소문자 바꿔서 출력하기
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class PrintCharacterChangeCase {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] characters = a.toCharArray();
        for (char character : characters) {
            if (Character.isUpperCase(character)) {
                bw.write(Character.toLowerCase(character));
            } else {
                bw.write(Character.toUpperCase(character));
            }
        }

        bw.close();
        sc.close();
    }
}

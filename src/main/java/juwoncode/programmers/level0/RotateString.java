/**
 * title : 문자열 돌리기
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] aSplit = a.split("");
        for (String string : aSplit) {
            bw.write(string + "\n");
        }

        bw.close();
        sc.close();
    }
}

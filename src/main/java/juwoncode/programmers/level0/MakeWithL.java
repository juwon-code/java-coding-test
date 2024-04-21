/**
 * title : l로 만들기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class MakeWithL {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(solution(br.readLine()));
        bw.close();
        br.close();
    }

    public static String solution(String string) {
        char[] characters = string.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] < 'l') {
                characters[i] = 'l';
            }
        }

        return new String(characters);
    }
}

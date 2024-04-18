/**
 * title : A 강조하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class EmphasisA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(solution(br.readLine()));

        bw.close();
        br.close();
    }

    public static String solution(String string) {
        String[] splitArray = string.split("");

        for (int i = 0; i < splitArray.length; i++) {
            if (splitArray[i].equalsIgnoreCase("a")) {
                splitArray[i] = splitArray[i].toUpperCase();
            } else {
                splitArray[i] = splitArray[i].toLowerCase();
            }
        }

        return String.join("", splitArray);
    }
}

/**
 * no          : 11478
 * title       : 서로 다른 부분 문자열의 개수
 * description : 문자열 S가 주어질 때, S의 서로 다른 부분 문자열의 개수를 구하시오.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class P11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> set = new HashSet<>();
        String string = br.readLine();
        final int LENGTH = string.length();

        for (int i = 0; i < LENGTH; i++) {
            for (int j = i + 1; j <= LENGTH; j++) {
                set.add(string.substring(i, j));
            }
        }

        bw.write(String.valueOf(set.size()));
        bw.close();
        br.close();
    }
}

/**
 * no          : 1181
 * title       : 단어 정렬
 * description : 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래 조건과 같이 정렬하고 출력하시오.
 *      1. 길이가 짧은 것부터
 *      2. 길이가 같으면 사전 순으로
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 및 중복 제거.
        int count = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < count; i++) {
            set.add(br.readLine());
        }

        // 배열 변환 및 정렬.
        String[] array = set.toArray(new String[0]);
        Arrays.sort(array, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            } else {
                return s1.length() - s2.length();
            }
        });

        // 출력.
        for (String string : array) {
            bw.write(string + "\n");
        }

        bw.close();
        br.close();
    }
}

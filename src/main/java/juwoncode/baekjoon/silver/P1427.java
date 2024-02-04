/**
 * no          : 1427
 * title       : 소트인사이드
 * description : 배열의 자리수를 내림차순으로 정렬하고 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class P1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = br.readLine().split("");

        Arrays.sort(array, Collections.reverseOrder());

        for (String string : array) {
            bw.write(string);
        }

        bw.close();
        br.close();
    }
}

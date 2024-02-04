/**
 * no          : 10814
 * title       : 나이순 정렬
 * description : 가입한 사람들의 나이와 이름이 순서대로 주어진다. 나이순으로 정렬하되, 같을 경우 먼저 가입한 사람 순으로 정렬하고 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 입력.
        int count = Integer.parseInt(br.readLine());
        String[][] array = new String[count][2];
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            array[i][0] = st.nextToken();
            array[i][1] = st.nextToken();
        }

        // 정렬.
        Arrays.sort(array, Comparator.comparingInt(_array -> Integer.parseInt(_array[0])));

        // 출력.
        for (int i = 0; i < count; i++) {
            bw.write(array[i][0] + " " + array[i][1] + "\n");
        }

        bw.close();
        br.close();
    }
}

/**
 * no          : 11650
 * title       : 좌표 정렬하기
 * description : x좌표 순으로 정렬하되, 같을 경우 y좌표 순으로 정렬하고 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        int[][] array = new int[count][2];

        // 입력.
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        // 정렬.
        Arrays.sort(array, (array1, array2) -> {
            if (array1[0] == array2[0]) {
                return array1[1] - array2[1];
            } else {
                return array1[0] - array2[0];
            }
        });

        // 출력.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(array[i][0]);
            sb.append(" ");
            sb.append(array[i][1]);
            sb.append("\n");
        }
        bw.write(sb.toString());

        bw.close();
        br.close();
    }
}

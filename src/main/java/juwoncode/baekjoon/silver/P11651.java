/**
 * no          : 11651
 * title       : 좌표 정렬하기 2
 * description : y좌표 순으로 정렬하되, 같을 경우 x좌표 순으로 정렬하고 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        int[][] array = new int[count][2];

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array, (array1, array2) -> {
            if (array1[1] == array2[1]) {
                return array1[0] - array2[0];
            } else {
                return array1[1] - array2[1];
            }
        });

        for (int i = 0; i < count; i++) {
            bw.write(array[i][0] + " " + array[i][1] + "\n");
        }

        bw.close();
        br.close();
    }
}

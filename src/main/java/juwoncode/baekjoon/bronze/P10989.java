/**
 * no          : 10989
 * title       : 수 정렬하기 3
 * description : N개의 수가 주어졌을 때, 오름차순으로 정렬하고 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.io.*;

public class P10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] array = new int[10001];

        for (int i = 0; i < count; i++) {
            int index = Integer.parseInt(br.readLine());
            array[index]++;
        }

        for (int i = 0; i < 10001; i++) {
            int number = array[i];
            if (number > 0) {
                for (int j = 0; j < number; j++) {
                    bw.write(i + "\n");
                }
            }
        }

        bw.close();
        br.close();
    }
}

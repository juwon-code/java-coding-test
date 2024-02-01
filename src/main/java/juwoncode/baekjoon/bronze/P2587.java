/**
 * no          : 2587
 * title       : 대표값2
 * description : 숫자 5개를 입력받아, 중앙값과 평균값을 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.io.*;

public class P2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int LENGTH = 5;
        int[] array = new int[LENGTH];

        // 입력받기
        for (int i = 0; i < LENGTH; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        // 정렬하기
        for (int i = 0; i < LENGTH - 1; i++) {
            int pointer = i;
            for (int j = i + 1; j < LENGTH; j++) {
                if (array[pointer] > array[j]) {
                    pointer = j;
                }
            }
            int temp = array[pointer];
            array[pointer] = array[i];
            array[i] = temp;
        }

        // 평균 구하기
        int avg = 0;
        for (int number : array) {
            avg += number;
        }
        avg /= LENGTH;

        // 출력하기
        bw.write(avg + "\n" + array[2]);

        bw.close();
        br.close();
    }
}

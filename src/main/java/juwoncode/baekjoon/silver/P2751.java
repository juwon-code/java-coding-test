/**
 * no          : 2751
 * title       : 수 정렬하기 2
 * description : N개의 수가 주어졌을 때, 라이브러리를 사용하여 오름차순으로 정렬하시오.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.Arrays;

public class P2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        
        // 입력받기
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        // 정렬하기
        Arrays.sort(array);

        // 출력하기
        for (int number : array) {
            bw.write(number + "\n");
        }
        
        bw.close();
        br.close();
    }
}

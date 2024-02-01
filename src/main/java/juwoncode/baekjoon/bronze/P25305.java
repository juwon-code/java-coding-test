/**
 * no          : 25305
 * title       : 커트라인
 * description : 응시자의 수 N, 상을받는 수 K, 응시자 점수 M을 입력받을 때, 커트라인 점수를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class P25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken()) - 1;

        st = new StringTokenizer(br.readLine());
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j - 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        bw.write(String.valueOf(array[index]));

        bw.close();
        br.close();
    }
}

/**
 * no          : 18870
 * title       : 좌표 압축
 * description : N개의 좌표가 주어질 때 좌표값의 순서를 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.*;

public class P18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력.
        int count = Integer.parseInt(br.readLine());
        int[] originArray = new int[count];
        int[] sortedArray = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(st.nextToken());
            originArray[i] = number;
            sortedArray[i] = number;
        }

        // 정렬.
        Arrays.sort(sortedArray);
        Map<Integer, Integer> ranks = new HashMap<>();
        int rank = 0;
        for (int number : sortedArray) {
            if (!ranks.containsKey(number)) {
                ranks.put(number, rank);
                rank++;
            }
        }

        // 출력.
        StringBuilder sb = new StringBuilder();
        for (int number : originArray) {
            sb.append(ranks.get(number));
            sb.append(" ");
        }
        bw.write(sb.toString());

        bw.close();
        br.close();
    }
}

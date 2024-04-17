/**
 * title : 순서 바꾸기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(array, n)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array, int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = n; i < array.length; i++) {
            list.add(array[i]);
        }

        for (int i = 0; i < n; i++) {
            list.add(array[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

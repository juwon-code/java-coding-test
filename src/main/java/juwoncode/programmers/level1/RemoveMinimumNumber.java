/**
 * title : 제일 작은 수 제거하기
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMinimumNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(array)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array) {
        int minimum = Integer.MAX_VALUE;

        for (int number : array) {
            if (number < minimum) {
                minimum = number;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int number : array) {
            if (number != minimum) {
                list.add(number);
            }
        }

        return list.size() == 0 ? new int[]{-1} : list.stream().mapToInt(Integer::intValue).toArray();
    }
}

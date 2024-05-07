/**
 * title : 두 개 뽑아서 더하기
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.*;

public class PickTwoAndAdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(array)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array) {
        Set<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                resultSet.add(array[i] + array[j]);
            }
        }

        return resultSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}

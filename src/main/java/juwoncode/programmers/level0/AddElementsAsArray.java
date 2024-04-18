/**
 * title : 배열의 원소만큼 추가하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AddElementsAsArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(array)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array) {
        List<Integer> result = new ArrayList<>();

        Arrays.stream(array)
                .forEach(i -> IntStream.range(0, i)
                        .forEach(j -> result.add(i))
                );

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

/**
 * title : 배열의 길이를 2의 거듭제곱으로 만들기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MakeArrayLengthPowerOfTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(array)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array) {
        List<Integer> list = new ArrayList<>(Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new)));
        int expLength = 1, arrLength = array.length;

        for (int i = 1; expLength < arrLength; i++) {
            expLength = (int) Math.pow(2, i);
        }

        IntStream.range(0, expLength - arrLength).forEach(i -> list.add(0));

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

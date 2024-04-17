/**
 * title : n개 간격의 원소들
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ElementsInInterval {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(array, n)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array, int interval) {
        return IntStream.range(0, array.length).filter(i -> i % interval == 0).map(i -> array[i]).toArray();
    }
}

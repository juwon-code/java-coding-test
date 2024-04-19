/**
 * title : 무작위로 k개의 수 뽑기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class RandomPickK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int k = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(array, k)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array, int k) {
        int[] distArray = Arrays.stream(array).distinct().toArray();

        return IntStream.range(0, k).map(i -> i > distArray.length - 1 ? -1 : distArray[i]).toArray();
    }
}

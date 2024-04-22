/**
 * title : 짝수는 싫어요
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class IHateEven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(n)));

        bw.close();
        br.close();
    }

    public static int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 != 0).toArray();
    }
}

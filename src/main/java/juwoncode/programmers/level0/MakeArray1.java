/**
 * title : 배열 만들기 1
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MakeArray1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(n, k)));

        bw.close();
        br.close();
    }

    public static int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray();
    }
}

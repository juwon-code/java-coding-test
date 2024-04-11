/**
 * title : 배열 만들기 2
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MakeArray2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int left = Integer.parseInt(br.readLine());
        int right = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(left, right)));

        bw.close();
    }

    public static int[] solution(int l, int r) {
        int [] result = IntStream.rangeClosed(l, r)
                .filter(i -> String.valueOf(i).matches("^[05]+$")).toArray();

        return result.length == 0 ? new int[]{-1} : result;
    }
}

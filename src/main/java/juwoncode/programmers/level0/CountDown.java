/**
 * title : 카운트 다운
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class CountDown {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(start, end)));

        bw.close();
    }

    public static int[] solution(int start, int end) {
        return IntStream.rangeClosed(end, start)
                .boxed().sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
    }
}

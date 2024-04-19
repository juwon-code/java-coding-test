/**
 * title : 뒤에서 5등까지
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class FifthFromBack1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(array)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array) {
        return Arrays.stream(array).sorted().limit(5).toArray();
    }
}

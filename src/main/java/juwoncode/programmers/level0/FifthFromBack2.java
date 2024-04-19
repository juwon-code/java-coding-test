/**
 * title : 뒤에서 5등위로
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class FifthFromBack2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        bw.write(Arrays.toString(solution(array)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array) {
        return Arrays.stream(array).sorted().skip(5).toArray();
    }
}

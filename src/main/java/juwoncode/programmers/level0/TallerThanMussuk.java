/**
 * title : 머쓱이보다 키 큰 사람
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class TallerThanMussuk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int height = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(solution(array, height)));
        bw.close();
        br.close();
    }

    public static int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }
}

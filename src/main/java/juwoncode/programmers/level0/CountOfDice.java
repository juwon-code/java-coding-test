/**
 * title : 주사위의 개수
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class CountOfDice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] box = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(box, n)));

        bw.close();
        br.close();
    }

    public static int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}

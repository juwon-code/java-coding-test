/**
 * title : 폰켓몬
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.Arrays;

public class Phoneketmon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] monsters = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(monsters)));

        bw.close();
        br.close();
    }

    public static int solution(int[] monsters) {
        int distSize = (int) Arrays.stream(monsters).distinct().count();
        int count = monsters.length / 2;

        return Math.min(distSize, count);
    }
}

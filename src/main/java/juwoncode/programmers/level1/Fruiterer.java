/**
 * title : 과일 장수
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.Arrays;

public class Fruiterer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int highest = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int[] apples = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(highest, count, apples)));

        bw.close();
        br.close();
    }

    public static int solution(int highest, int count, int[] apples) {
        Arrays.sort(apples);

        int result = 0;
        for (int i = apples.length; i >= count; i -= count) {
            result += apples[i - count] * count;
        }

        return result;
    }
}

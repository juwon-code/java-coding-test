/**
 * title : 덧칠하기
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.Arrays;

public class Overcoat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int wallLength = Integer.parseInt(br.readLine());
        int rollLength = Integer.parseInt(br.readLine());
        int[] sections = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(wallLength, rollLength, sections)));

        bw.close();
        br.close();
    }

    public static int solution(int wallLength, int rollLength, int[] sections) {
        if (wallLength < rollLength) {
            return 0;
        }

        Arrays.sort(sections);

        int rollCount = 1, remIndex = sections[0];
        for (int section : sections) {
            if (section > remIndex + rollLength - 1) {
                rollCount++;
                remIndex = section;
            }
        }

        return rollCount;
    }
}

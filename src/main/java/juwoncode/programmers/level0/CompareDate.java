/**
 * title : 날짜 비교하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class CompareDate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] date1 = stringToIntArray(br.readLine());
        int[] date2 = stringToIntArray(br.readLine());
        bw.write(String.valueOf(solution(date1, date2)));

        bw.close();
        br.close();
    }

    private static int[] stringToIntArray(String string) {
        return Arrays.stream(string.split(", ")).mapToInt(Integer::parseInt).toArray();
    }

    public static int solution(int[] date1, int[] date2) {
        if (date1[0] == date2[0]) {
            if (date1[1] == date2[1]) {
                if (date1[2] == date2[2]) {
                    return 0;
                } else {
                    return date1[2] < date2[2] ? 1 : 0;
                }
            } else {
                return date1[1] < date2[1] ? 1 : 0;
            }
        } else {
            return date1[0] < date2[0] ? 1 : 0;
        }
    }
}

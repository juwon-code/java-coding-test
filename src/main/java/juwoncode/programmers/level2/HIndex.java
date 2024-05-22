/**
 * title : H-Index
 */

package juwoncode.programmers.level2;

import java.io.*;
import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] citations = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(citations)));

        bw.close();
        br.close();
    }

    public static int solution(int[] citations) {
        int answer = 0, length = citations.length;

        Arrays.sort(citations);

        for (int i = 0; i < length; i++) {
            int count = length - i;

            if (citations[i] >= count) {
                answer = count;
                break;
            }
        }

        return answer;
    }
}

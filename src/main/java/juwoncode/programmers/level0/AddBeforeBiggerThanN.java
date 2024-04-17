/**
 * title : n보다 커질 때까지 더하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class AddBeforeBiggerThanN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(array, n)));

        bw.close();
        br.close();
    }

    public static int solution(int[] array, int n) {
        int answer = 0;

        for (int number : array) {
            answer += number;
            if (n < answer) {
                break;
            }
        }

        return answer;
    }
}

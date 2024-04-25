/**
 * title : 합성수 찾기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class FindCompositeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(number)));

        bw.close();
        br.close();
    }

    public static int solution(int number) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count > 1) {
                answer++;
            }
        }

        return answer;
    }
}

/**
 * title : 홀짝에 따라 다른 값 반환하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class PrintDependsOnOddEven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(n)));

        bw.close();
        br.close();
    }

    public static int solution(int n) {
        int answer = 0;

        if (n % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += Math.pow(i, 2);
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    answer += i;
                }
            }
        }

        return answer;
    }
}

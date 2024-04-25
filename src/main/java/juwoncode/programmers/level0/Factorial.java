/**
 * title : 팩토리얼
 */

package juwoncode.programmers.level0;

import java.io.*;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(number)));

        bw.close();
        br.close();
    }

    public static int solution(int number) {
        int result = 1;

        while (number != result) {
            if (number < result) {
                result--;
                break;
            }
            number /= result++;
        }

        return result;
    }
}

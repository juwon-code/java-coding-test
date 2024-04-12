/**
 * title : 9로 나눈 나머지
 */

package juwoncode.programmers.level0;

import java.io.*;

public class RemainderByNine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        bw.write(String.valueOf(solution(number)));

        bw.close();
        br.close();
    }

    public static int solution(String number) {
        String[] splitNumbers = number.split("");
        int answer = 0;

        for (String splitNumber : splitNumbers) {
            answer += Integer.parseInt(splitNumber);
        }
        
        return answer % 9;
    }
}

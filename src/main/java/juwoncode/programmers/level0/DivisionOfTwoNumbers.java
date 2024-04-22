/**
 * title : 두 수의 나눗셈
 */

package juwoncode.programmers.level0;

import java.io.*;

public class DivisionOfTwoNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number1 = Integer.parseInt(br.readLine()), number2 = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(solution(number1, number2)));
        bw.close();
        br.close();
    }

    public static int solution(int number1, int number2) {
        return number1 * 1000 / number2;
    }
}

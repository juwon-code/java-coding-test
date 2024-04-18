/**
 * title : 간단한 식 계산하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class EvaluateSimpleExpressions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(solution(br.readLine())));

        bw.close();
        br.close();
    }

    public static int solution(String binomial) {
        String[] array = binomial.split(" ");
        int number1 = Integer.parseInt(array[0]);
        String exp = array[1];
        int number2 = Integer.parseInt(array[2]);

        if (exp.equals("+")) {
            return number1 + number2;
        } else if (exp.equals("-")) {
            return number1 - number2;
        } else {
            return number1 * number2;
        }
    }
}

/**
 * title : 정수 부분
 */

package juwoncode.programmers.level0;

import java.io.*;

public class IntegerPart {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(solution(Double.parseDouble(br.readLine()))));

        bw.close();
        br.close();
    }

    public static int solution(double flo) {
        return (int) flo;
    }
}

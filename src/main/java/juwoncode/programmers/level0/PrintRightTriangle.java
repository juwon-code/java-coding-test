/**
 * title : 직각삼각형 출력하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class PrintRightTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int line = Integer.parseInt(br.readLine());
        for (int i = 0; i < line; i++) {
            sb.append("*");
            bw.write(sb + "\n");
        }

        bw.close();
        br.close();
    }
}

/**
 * title : flag에 따라 다른 값 반환하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class PrintDependsOnFlag {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        boolean flag = Boolean.parseBoolean(br.readLine());

        bw.write(String.valueOf(solution(a, b, flag)));
        bw.close();
        br.close();
    }

    public static int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}

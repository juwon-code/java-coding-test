/**
 * title : 나이 출력
 */

package juwoncode.programmers.level0;

import java.io.*;

public class PrintAge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int age = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(age)));

        bw.close();
        br.close();
    }

    public static int solution(int age) {
        return 2023 - age;
    }
}

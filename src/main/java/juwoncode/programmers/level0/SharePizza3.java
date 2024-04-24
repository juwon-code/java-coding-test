/**
 * title : 피자 나눠 먹기 (3)
 */

package juwoncode.programmers.level0;

import java.io.*;

public class SharePizza3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int slice = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(slice, n)));

        bw.close();
        br.close();
    }

    public static int solution(int slice, int n) {
        return (int) Math.ceil((double) n / slice);
    }
}

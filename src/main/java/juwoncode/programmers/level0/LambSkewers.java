/**
 * title : 양꼬치
 */

package juwoncode.programmers.level0;

import java.io.*;

public class LambSkewers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lamb = Integer.parseInt(br.readLine()), drink = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(lamb, drink)));

        bw.close();
        br.close();
    }

    public static int solution(int lamb, int drink) {
        return lamb * 12000 + drink * 2000 - lamb / 10 * 2000;
    }
}

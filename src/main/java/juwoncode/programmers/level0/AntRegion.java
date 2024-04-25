/**
 * title : 개미 군단
 */

package juwoncode.programmers.level0;

import java.io.*;

public class AntRegion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int hp = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(hp)));

        bw.close();
        br.close();
    }

    public static int solution(int hp) {
        int ants = 0;
        if (hp >= 5) {
            ants += hp / 5;
            hp %= 5;
        }
        if (hp >= 3) {
            ants += hp / 3;
            hp %= 3;
        }

        return ants + hp;
    }
}

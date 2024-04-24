/**
 * title : 각도기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class Protractor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int angle = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(angle)));

        bw.close();
        br.close();
    }

    public static int solution(int angle) {
        if (angle < 90) {
            return 1;
        }
        if (angle == 90) {
            return 2;
        }
        if (angle < 180) {
            return 3;
        }
        return 4;
    }
}

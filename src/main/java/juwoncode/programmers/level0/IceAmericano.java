/**
 * title : 아이스 아메리카노
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class IceAmericano {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int money = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(money)));

        bw.close();
        br.close();
    }

    public static int[] solution(int money) {
        return new int[]{money / 5500, money % 5500};
    }
}

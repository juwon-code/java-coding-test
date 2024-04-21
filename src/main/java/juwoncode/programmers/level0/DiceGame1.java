/**
 * title : 주사위 게임 1
 */

package juwoncode.programmers.level0;

import java.io.*;

public class DiceGame1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int dice1 = Integer.parseInt(br.readLine()), dice2 = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(dice1, dice2)));

        bw.close();
        br.close();
    }

    public static int solution(int dice1, int dice2) {
        if (dice1 % 2 != 0 && dice2 % 2 != 0) {
            return (int) (Math.pow(dice1, 2) + Math.pow(dice2, 2));
        } else if (dice1 % 2 != 0 || dice2 % 2 != 0) {
            return 2 * (dice1 + dice2);
        } else {
            return Math.abs(dice1 - dice2);
        }
    }
}

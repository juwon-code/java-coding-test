/**
 * title : 캐릭터의 좌표
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class CoordinateOfCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = new String[]{"down", "down", "down", "down", "down"};
        int[] board = new int[]{7, 9};
        bw.write(Arrays.toString(solution(inputs, board)));

        bw.close();
        br.close();
    }

    public static int[] solution(String[] inputs, int[] board) {
        int[] result = new int[2];
        int xLimit = board[0] / 2, yLimit = board[1] / 2;

        for (String input : inputs) {
            switch (input) {
                case "right" -> result[0]++;
                case "left" -> result[0]--;
                case "up" -> result[1]++;
                case "down" -> result[1]--;
            }

            if (Math.abs(result[0]) > xLimit) {
                result[0] = result[0] > 0 ? xLimit : -xLimit;
            } else if (Math.abs(result[1]) > yLimit) {
                result[1] = result[1] > 0 ? yLimit : -yLimit;
            }
        }

        return result;
    }
}

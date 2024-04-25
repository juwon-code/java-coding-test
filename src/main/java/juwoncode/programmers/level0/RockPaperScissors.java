/**
 * title : 가위 바위 보
 */

package juwoncode.programmers.level0;

import java.io.*;

public class RockPaperScissors {
    private final static String ROCK = "0";
    private final static String PAPER = "5";
    private final static String SCISSOR = "2";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String rsp = br.readLine();
        bw.write(solution(rsp));

        bw.close();
        br.close();
    }

    public static String solution(String rsp) {
        String[] commands = rsp.split("");
        StringBuilder result = new StringBuilder();

        for (String command : commands) {
            if (command.equals(ROCK)) {
                result.append(PAPER);
            } else if (command.equals(PAPER)) {
                result.append(SCISSOR);
            } else {
                result.append(ROCK);
            }
        }

        return result.toString();
    }
}

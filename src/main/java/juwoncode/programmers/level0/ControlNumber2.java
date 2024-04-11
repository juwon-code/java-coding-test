/**
 * title : 수 조작하기 2
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class ControlNumber2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numLog = new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        bw.write(solution(numLog));

        bw.close();
    }

    private final static Map<Integer, String> command = new HashMap<>(){{
        put(1, "w");
        put(-1, "s");
        put(10, "d");
        put(-10, "a");
    }};

    public static String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int temp = numLog[0];
        for (int i = 1; i < numLog.length; i++) {
            int curr = numLog[i];
            if (temp != curr) {
                sb.append(command.get(curr - temp));
            }
            temp = curr;
        }

        return sb.toString();
    }
}

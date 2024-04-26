/**
 * title : 컨트롤 제트
 */

package juwoncode.programmers.level0;

import java.io.*;

public class ControlZ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        bw.write(String.valueOf(solution(string)));

        bw.close();
        br.close();
    }

    public static int solution(String string) {
        String[] commands = string.split(" ");
        int result = 0;

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("Z")) {
                result -= Integer.parseInt(commands[i - 1]);
            } else {
                result += Integer.parseInt(commands[i]);
            }
        }

        return result;
    }
}

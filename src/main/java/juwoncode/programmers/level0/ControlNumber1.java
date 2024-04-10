/**
 * title : 수 조작하기 1
 */

package juwoncode.programmers.level0;

import java.io.*;

public class ControlNumber1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int init = Integer.parseInt(br.readLine());
        String control = br.readLine();
        bw.write(String.valueOf(solution(init, control)));

        bw.close();
        br.close();
    }

    private enum ControlNumber {
        w(1), s(-1), d(10), a(-10);

        private final int number;

        ControlNumber(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

    public static int solution(int n, String control) {
        String[] commands = control.split("");
        for (String command : commands) {
            n += ControlNumber.valueOf(command).getNumber();
        }

        return n;
    }
}

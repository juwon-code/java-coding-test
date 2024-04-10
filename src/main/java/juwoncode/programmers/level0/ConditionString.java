/**
 * title : 조건 문자열
 */

package juwoncode.programmers.level0;

import java.io.*;

public class ConditionString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String ineq = br.readLine();
        String eq = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(solution(ineq, eq, n, m)));
        bw.close();
        br.close();
    }

    public static int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                return n <= m ? 1 : 0;
            } else {
                return n < m ? 1 : 0;
            }
        } else {
            if (eq.equals("=")) {
                return n >= m ? 1 : 0;
            } else {
                return n > m ? 1 : 0;
            }
        }
    }
}

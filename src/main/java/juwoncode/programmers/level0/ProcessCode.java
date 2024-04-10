/**
 * title : 코드 처리하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class ProcessCode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String code = br.readLine();
        bw.write(solution(code));

        bw.close();
        br.close();
    }

    public static String solution(String code) {
        String[] codes = code.split("");
        StringBuilder sb = new StringBuilder();

        boolean mod = false;
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].equals("1")) {
                mod = !mod;
                continue;
            }

            if ((mod && i % 2 != 0) || (!mod && i % 2 == 0)) {
                sb.append(codes[i]);
            }
        }

        return sb.length() > 0 ? sb.toString() : "EMPTY";
    }
}

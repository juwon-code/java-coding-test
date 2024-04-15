/**
 * title : qr code
 */

package juwoncode.programmers.level0;

import java.io.*;

public class QRCode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        String code = br.readLine();
        bw.write(solution(q, r, code));

        bw.close();
        br.close();
    }

    public static String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                sb.append(code.charAt(i));
            }
        }

        return sb.toString();
    }
}

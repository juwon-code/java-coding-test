/**
 * title : 세로 읽기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class VerticalReading {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        int m = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        bw.write(solution(string, m, c));

        bw.close();
        br.close();
    }

    public static String solution(String string, int m, int c) {
        int n = string.length() / m;
        String[][] array = new String[n][m];

        int h = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = String.valueOf(string.charAt(h));
                h++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String[] arr : array) {
            sb.append(arr[c - 1]);
        }

        return sb.toString();
    }
}

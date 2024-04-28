/**
 * title : 직사각형 별찍기
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.StringTokenizer;

public class RectangularStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        for (int i = 0; i < y; i++) {
            bw.write("*".repeat(x) + "\n");
        }

        bw.close();
        br.close();
    }
}

/**
 * no          : 9012
 * title       : 괄호
 * description : 소괄호("()")로 이루어진 문자열은 짝을 이뤄야한다. 균형잡힌 문자열이면 "YES", 아니라면 "NO"를 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.Arrays;

public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        boolean[] results = new boolean[count];
        Arrays.fill(results, true);
        for (int i = 0; i < count; i++) {
            String[] string = br.readLine().split("");
            int opens = 0, closes = 0;
            for (String sign : string) {
                if (sign.equals("(")) {
                    opens++;
                    continue;
                }
                if (sign.equals(")")) {
                    closes++;
                }
                if (opens < closes) {
                    results[i] = false;
                    break;
                }
            }
            if (opens != closes) {
                results[i] = false;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (boolean result : results) {
            sb.append(result ? "YES" : "NO");
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

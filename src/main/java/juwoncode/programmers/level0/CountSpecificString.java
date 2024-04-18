/**
 * title : 문자열이 몇 번 등장하는지 세기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class CountSpecificString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        String pat = br.readLine();
        bw.write(String.valueOf(solution(string, pat)));

        bw.close();
        br.close();
    }

    public static int solution(String string, String pat) {
        int count = 0;
        int index = 0;
        
        while ((index = string.indexOf(pat, index)) != -1) {
            count++;
            index++;
        }

        return count;
    }
}

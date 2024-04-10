/**
 * title : 문자 리스트를 문자열로 변환하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class ConvertCharactersToString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split("");
        bw.write(solution(arr));

        bw.close();
        br.close();
    }

    public static String solution(String[] arr) {
        return String.join("", arr);
    }
}

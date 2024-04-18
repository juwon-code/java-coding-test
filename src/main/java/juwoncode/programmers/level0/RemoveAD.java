/**
 * title : ad 제거하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = Arrays.stream(br.readLine().split(", ")).toArray(String[]::new);
        bw.write(Arrays.toString(solution(array)));

        bw.close();
        br.close();
    }

    public static String[] solution(String[] array) {
        List<String> list = new ArrayList<>();

        for (String string : array) {
            if (!string.contains("ad")) {
                list.add(string);
            }
        }

        return list.toArray(String[]::new);
    }
}

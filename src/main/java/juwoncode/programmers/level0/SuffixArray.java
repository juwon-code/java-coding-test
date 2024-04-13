/**
 * title : 접미사 배열
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SuffixArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        bw.write(Arrays.toString(solution(string)));

        bw.close();
    }

    public static String[] solution(String string) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            list.add(string.substring(i));
        }
        list.sort(Comparator.naturalOrder());

        return list.toArray(new String[0]);
    }
}

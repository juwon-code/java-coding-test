/**
 * title : 왼쪽 오른쪽
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LeftRight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strings = br.readLine().split(", ");
        bw.write(Arrays.toString(solution(strings)));

        bw.close();
        br.close();
    }

    public static String[] solution(String[] strings) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("l")) {
                IntStream.range(0, i).forEach(j -> list.add(strings[j]));
                break;
            }
            if (strings[i].equals("r")) {
                IntStream.range(++i, strings.length).forEach(j -> list.add(strings[j]));
                break;
            }
        }

        return list.toArray(new String[0]);
    }
}

/**
 * title : 글자 이어 붙여 문자열 만들기
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ConnectLetters {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] my_strings = new String[]{"cvsgiorszzzmrpaqpe", "zpiaz"};
        int[][] index_lists = new int[][]{{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}, {1, 2, 0, 0, 3}};

        bw.write(solution(my_strings[0], index_lists[0]));
        bw.write("\n");
        bw.write(solution(my_strings[1], index_lists[1]));

        bw.close();
    }

    public static String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        char[] characters = my_string.toCharArray();
        for (int index : index_list) {
            sb.append(characters[index]);
        }

        return sb.toString();
    }
}

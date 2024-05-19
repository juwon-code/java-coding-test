/**
 * title : 영어 끝말잇기
 */

package juwoncode.programmers.level2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnglishShiritori {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int people = Integer.parseInt(br.readLine());
        String[] words = br.readLine().split(", ");
        bw.write(Arrays.toString(solution(people, words)));

        bw.close();
        br.close();
    }

    public static int[] solution(int people, String words[]) {
        int[] turns = new int[people], result = new int[2];
        List<String> dictionary = new ArrayList<>();
        char prev = '?';

        int player = 0;
        for (String word : words) {
            if (prev == '?' || (prev == word.charAt(0) && !dictionary.contains(word))) {
                prev = word.charAt(word.length() - 1);
                turns[player++]++;
                dictionary.add(word);
            } else {
                result[0] = player + 1;
                result[1] = turns[player] + 1;
                break;
            }
            if (player == people) {
                player -= people;
            }
        }

        return result;
    }
}

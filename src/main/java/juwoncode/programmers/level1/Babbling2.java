/**
 * title : 옹알이 (2)
 */

package juwoncode.programmers.level1;

import java.io.*;

public class Babbling2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] babblings = br.readLine().split(", ");
        bw.write(String.valueOf(solution(babblings)));

        bw.close();
        br.close();
    }

    private final static String[] WORDS = new String[] {"aya", "ye", "woo", "ma"};

    public static int solution(String[] babblings) {
        int count = 0;

        for (String babbling : babblings) {
            if (babbling.contains("ayaaya") || babbling.contains("yeye") || babbling.contains("woowoo") || babbling.contains("mama")) {
                continue;
            }

            for (String word : WORDS) {
                babbling = babbling.replaceAll(word, " ");
            }

            if (babbling.isBlank()) {
                count++;
            }
        }

        return count;
    }
}

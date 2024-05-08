/**
 * title : 모의고사
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockTest {
    private static final int[] PERSON1 = {1, 2, 3, 4, 5};
    private static final int[] PERSON2 = {2, 1, 2, 3, 2, 4, 2, 5};
    private static final int[] PERSON3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] answers = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(answers)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] answers) {
        int score1 = 0, score2 = 0, score3 = 0;
        int lengthAns = answers.length, length1 = PERSON1.length, length2 = PERSON2.length, length3 = PERSON3.length;

        for (int i = 0; i < lengthAns; i++) {
            if (PERSON1[i % length1] == answers[i]) {
                score1++;
            }
            if (PERSON2[i % length2] == answers[i]) {
                score2++;
            }
            if (PERSON3[i % length3] == answers[i]) {
                score3++;
            }
        }

        int maxScore = Math.max(score1, Math.max(score2, score3));
        List<Integer> result = new ArrayList<>();

        if (score1 == maxScore) {
            result.add(1);
        }
        if (score2 == maxScore) {
            result.add(2);
        }
        if (score3 == maxScore) {
            result.add(3);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

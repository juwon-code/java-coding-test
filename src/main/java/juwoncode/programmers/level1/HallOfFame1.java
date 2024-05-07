/**
 * title : 명예의 전당(1)
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.*;

public class HallOfFame1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rank = Integer.parseInt(br.readLine());
        int[] scores = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(rank, scores)));

        bw.close();
        br.close();
    }

    public static int[] solution(int rank, int[] scores) {
        List<Integer> pList = new ArrayList<>();
        List<Integer> rList = new ArrayList<>();

        for (int score : scores) {
            pList.add(score);
            pList.sort(Comparator.reverseOrder());

            if (pList.size() >= rank) {
                rList.add(pList.get(rank - 1));
            } else {
                rList.add(pList.get(pList.size() - 1));
            }
        }

        return rList.stream().mapToInt(Integer::intValue).toArray();
    }
}

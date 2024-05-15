/**
 * title : 체육복
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.*;

public class GymUniform {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] loses = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] reserves = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(count, loses, reserves)));

        bw.close();
        br.close();
    }

    public static int solution(int count, int[] loses, int[] reserves) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> revsSet = new HashSet<>();

        for (int number : reserves) {
            revsSet.add(number);
        }

        for (int lose : loses) {
            if (revsSet.contains(lose)) {
                revsSet.remove(lose);
            } else {
                lostSet.add(lose);
            }
        }

        for (int number : revsSet) {
            if (lostSet.contains(number - 1)) {
                lostSet.remove(number - 1);
                continue;
            }
            lostSet.remove(number + 1);
        }

        return count - lostSet.size();
    }
}

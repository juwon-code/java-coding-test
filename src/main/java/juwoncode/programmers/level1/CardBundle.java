/**
 * title : 카드 뭉치
 */

package juwoncode.programmers.level1;

import java.io.*;

public class CardBundle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] cards1 = br.readLine().split(", ");
        String[] cards2 = br.readLine().split(", ");
        String[] goal = br.readLine().split(", ");
        bw.write(solution(cards1, cards2, goal));

        bw.close();
        br.close();
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String result = "Yes";
        int index1 = 0, index2 = 0, length1 = cards1.length, length2 = cards2.length;

        for (String string : goal) {
            if (index1 != length1) {
                if (string.equals(cards1[index1])) {
                    index1++;
                    continue;
                }
            }

            if (index2 != length2) {
                if (string.equals(cards2[index2])) {
                    index2++;
                    continue;
                }
            }

            result = "No";
            break;
        }

        return result;
    }
}

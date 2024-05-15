/**
 * title : 문자열 나누기
 */

package juwoncode.programmers.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextLine()));

        sc.close();
    }

    public static int solution(String string) {
        List<String> list = new ArrayList<>();
        int length = string.length();
        char[] array = string.toCharArray();

        for (int i = 0; i < length; i++) {
            int sameCount = 1, diffCount = 0;
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    sameCount++;
                } else {
                    diffCount++;
                }
                if (sameCount == diffCount) {
                    list.add(string.substring(i, j + 1));
                    i = j;
                    break;
                }
            }
            if (sameCount != diffCount) {
                list.add(string.substring(i));
                break;
            }
        }

        return list.size();
    }
}

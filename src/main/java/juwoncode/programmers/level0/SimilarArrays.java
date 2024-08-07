/**
 * title : 배열의 유사도
 */

package juwoncode.programmers.level0;

public class SimilarArrays {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
        System.out.println(solution(new String[]{"n", "omg"}, new String[]{"m", "dot"}));
    }

    public static int solution(String[] s1, String[] s2) {
        return s1.length < s2.length ?
                countEqualElements(s1, s2) : countEqualElements(s2, s1);
    }

    private static int countEqualElements(String[] smallArray, String[] bigArray) {
        int count = 0;

        for (String s1 : smallArray) {
            for (String s2 : bigArray) {
                if (s1.equals(s2)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}

/**
 * title : 세균 증식
 */

package juwoncode.programmers.level0;

public class BacterialGrowth {
    public static void main(String[] args) {
        System.out.println(solution(2, 10));
        System.out.println(solution(7, 15));
    }

    public static int solution(int n, int t) {
        for (int i = 0; i < t; i++) {
            n *= 2;
        }

        return n;
    }
}

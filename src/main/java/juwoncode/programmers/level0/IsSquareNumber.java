/**
 * title : 제곱수 판별하기
 */

package juwoncode.programmers.level0;

public class IsSquareNumber {
    public static void main(String[] args) {
        System.out.println(solution(144));
        System.out.println(solution(976));
    }

    public static int solution(int n) {
        double square = Math.sqrt(n);

        return square == (int)square ? 1 : 2;
    }
}

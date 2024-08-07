/**
 * title : 자릿수 더하기
 */

package juwoncode.programmers.level0;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(solution(1234));
        System.out.println(solution(930211));
    }

    public static int solution(int n) {
        String[] array = (n + "").split("");
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            answer += Integer.parseInt(array[i]);
        }

        return answer;
    }
}

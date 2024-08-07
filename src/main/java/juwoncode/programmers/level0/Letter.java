/**
 * title : 편지
 */

package juwoncode.programmers.level0;

public class Letter {
    public static void main(String[] args) {
        System.out.println(solution("happy birthday!"));
        System.out.println(solution("I love you~"));
    }

    public static int solution(String message) {
        return 2 * message.length();
    }
}

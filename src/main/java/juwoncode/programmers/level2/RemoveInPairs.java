/**
 * title : 짝지어 제거하기
 */

package juwoncode.programmers.level2;

import java.util.Scanner;
import java.util.Stack;

public class RemoveInPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextLine()));

        sc.close();
    }

    public static int solution(String string) {
        char[] characters = string.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char character : characters) {
            if (stack.isEmpty()) {
                stack.push(character);
                continue;
            }

            if (stack.peek() == character) {
                stack.pop();
            } else {
                stack.push(character);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}

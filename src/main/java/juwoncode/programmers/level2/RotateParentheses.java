/**
 * title : 괄호 회전하기
 */

package juwoncode.programmers.level2;

import java.util.*;
import java.util.stream.Collectors;

public class RotateParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextLine()));

        sc.close();
    }

    public static int solution(String string) {
        int length = string.length(), answer = 0;
        List<String> list = new ArrayList<>(Arrays.stream(string.split("")).collect(Collectors.toList()));

        for (int i = 0; i < length; i++) {
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < length; j++) {
                String symbol = list.get(j);
                if (stack.isEmpty()) {
                    stack.push(symbol);
                } else if (stack.peek().equals("(") && symbol.equals(")")) {
                    stack.pop();
                } else if (stack.peek().equals("{") && symbol.equals("}")) {
                    stack.pop();
                } else if (stack.peek().equals("[") && symbol.equals("]")) {
                    stack.pop();
                } else {
                    stack.push(symbol);
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
            list.add(list.remove(0));
        }

        return answer;
    }
}

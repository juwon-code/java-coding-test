/**
 * no          : 4949
 * title       : 균형잡힌 세상
 * description : 문자열에 포함되는 괄호는 소괄호("()"), 대괄호("[]")의 두 종류이고, 짝을 이뤄야한다. 균형잡힌 문자열이면 "yes", 아니라면 "no"를 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class P4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Character, Character> map = new HashMap<>(){{
            put('(', ')');
            put('[', ']');
        }};

        StringBuilder sb = new StringBuilder();
        while (true) {
            char[] characters = br.readLine().toCharArray();

            if (characters.length == 1 && characters[0] == '.') {
                break;
            }

            Stack<Character> stack = new Stack<>();
            for (char character : characters) {
                if (character == '(' || character == '[') {
                    stack.push(character);
                } else if (character == ')' || character == ']') {
                    if (stack.empty() || character != map.get(stack.peek())) {
                        stack.push(character);
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            sb.append(stack.empty() ? "yes\n" : "no\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

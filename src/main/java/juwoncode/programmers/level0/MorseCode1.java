/**
 * title : 모스부호 (1)
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MorseCode1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String sentence = br.readLine();
        bw.write(solution(sentence));

        bw.close();
        br.close();
    }

    public static String solution(String sentence) {
        Map<String, String> map = Stream.of(new String[][] {
                {".-", "a"}, {"-...", "b"}, {"-.-.", "c"}, {"-..", "d"}, {".", "e"}, {"..-.", "f"}, {"--.", "g"},
                {"....", "h"}, {"..", "i"}, {".---", "j"}, {"-.-", "k"}, {".-..", "l"}, {"--", "m"}, {"-.", "n"},
                {"---", "o"}, {".--.", "p"}, {"--.-", "q"}, {".-.", "r"}, {"...", "s"}, {"-", "t"}, {"..-", "u"},
                {"...-", "v"}, {".--", "w"}, {"-..-", "x"}, {"-.--", "y"}, {"--..", "z"}
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        String[] letters = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String letter : letters) {
            result.append(map.get(letter));
        }

        return result.toString();
    }
}

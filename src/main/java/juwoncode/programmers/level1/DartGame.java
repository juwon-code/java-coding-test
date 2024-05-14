/**
 * title : [1차] 다트 게임
 */

package juwoncode.programmers.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DartGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextLine()));

        sc.close();
    }

    public static int solution(String string) {
        String[] darts = string.split("");
        List<Integer> scores = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (String dart : darts) {
            switch (dart) {
                case "S" -> {
                    scores.add((int) Math.pow(Integer.parseInt(sb.toString()), 1));
                    sb.setLength(0);
                }
                case "D" -> {
                    scores.add((int) Math.pow(Integer.parseInt(sb.toString()), 2));
                    sb.setLength(0);
                }
                case "T" -> {
                    scores.add((int) Math.pow(Integer.parseInt(sb.toString()), 3));
                    sb.setLength(0);
                }
                case "*" -> {
                    if (scores.size() >= 2) {
                        scores.set(scores.size() - 1, scores.get(scores.size() - 1) * 2);
                        scores.set(scores.size() - 2, scores.get(scores.size() - 2) * 2);
                    } else {
                        scores.set(scores.size() - 1, scores.get(scores.size() - 1) * 2);
                    }
                }
                case "#" -> scores.set(scores.size() - 1, scores.get(scores.size() - 1) * -1);
                default -> sb.append(dart);
            }
        }

        return scores.stream().mapToInt(Integer::intValue).sum();
    }
}

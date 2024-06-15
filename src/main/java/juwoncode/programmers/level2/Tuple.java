/**
 * title : 튜플
 */

package juwoncode.programmers.level2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tuple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(Arrays.toString(solution(scanner.nextLine())));

        scanner.close();
    }

    public static int[] solution(String string) {
        /*
            주어진 문자열에 다음 규칙을 적용하여 분리한다.
            - 1개 이상의 여는 중괄호({)로 시작한다.
            - 닫는 중괄호(})를 제외한 모든 문자를 개수와 상관없이 그룹핑한다.
            - 1개의 닫는 중괄호(})로 끝난다.
         */
        Pattern pattern = Pattern.compile("\\{+([^}]*)\\}");
        Matcher matcher = pattern.matcher(string);

        // 튜플을 중괄호 단위의 집합으로 분리한다.
        List<String> tuples = new ArrayList<>();
        while (matcher.find()) {
            tuples.add(matcher.group(1));
        }

        // 분리된 집합을 길이 순으로 정렬한다.
        tuples.sort(Comparator.comparingInt(String::length));

        // 원소들을 중복되지 않게 순서대로 저장한다.
        List<String> result = new ArrayList<>();
        for (String tuple : tuples) {
            String[] elements = tuple.split(",");
            for (String element : elements) {
                if (!result.contains(element)) {
                    result.add(element);
                }
            }
        }

        // 문자열 리스트를 정수 배열로 반환한다.
        return result.stream().mapToInt(Integer::parseInt).toArray();
    }
}

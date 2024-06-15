/**
 * title : [1차] 뉴스 클러스터링
 */

package juwoncode.programmers.level2;

import java.util.*;
import java.util.regex.Pattern;

public class NewsClustering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        System.out.print(solution(string1, string2));

        scanner.close();
    }

    public static int solution(String string1, String string2) {
        List<String> pairs1 = getSortedPairs(string1.toUpperCase());
        List<String> pairs2 = getSortedPairs(string2.toUpperCase());
        int size1 = pairs1.size(), size2 = pairs2.size();

        boolean isPairs1Bigger = size1 > size2;

        int intersection = (isPairs1Bigger) ?
                getIntersectionCount(pairs1, pairs2) : getIntersectionCount(pairs2, pairs1);
        int union = size1 + size2 - intersection;

        return intersection == 0 && union == 0 ? 65536 : (int) (((double) intersection / union) * 65536);
    }

    private static final Pattern PATTERN = Pattern.compile("[\\s]|[^A-Z]");

    private static List<String> getSortedPairs(String string) {
        List<String> pairs = new ArrayList<>();

        for (int i = 0; i < string.length() - 1; i++) {
            String subString = string.substring(i, i + 2);

            if (!PATTERN.matcher(subString).find()) {
                pairs.add(subString);
            }
        }

        pairs.sort(Comparator.naturalOrder());

        return pairs;
    }

    private static int getIntersectionCount(List<String> list1, List<String> list2) {
        List<String> copiedList = new ArrayList<>(list2);

        int count = 0;
        for (String string : list1) {
            for (int i = 0; i < copiedList.size(); i++) {
                if (string.equals(copiedList.get(i))) {
                    copiedList.remove(i);
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}

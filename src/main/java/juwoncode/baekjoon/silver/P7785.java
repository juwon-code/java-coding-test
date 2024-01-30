/**
 * no          : 7785
 * title       : 회사에 있는 사람
 * description : N만큼 출입기록이 (이름, 상태)의 형태로 주어질 때, 회사에 남아있는 사람을 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.util.*;

public class P7785 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            String name = scanner.next();
            String status = scanner.next();

            if (map.containsKey(name)) {
                map.remove(name);
            } else {
                map.put(name, status);
            }
        }

        List<String> nameList = new ArrayList<>(map.keySet());
        nameList.sort(Collections.reverseOrder());

        for (String name : nameList) {
            System.out.println(name);
        }

        scanner.close();
    }
}

/**
 * title : 서울에서 김서방 찾기
 */

package juwoncode.programmers.level1;

public class KimInSeoul {
    public static void main(String[] args) {
        String[] seoul = new String[]{"Jane", "Kim", "Nowon"};

        System.out.print(solution(seoul));
    }

    public static String solution(String[] seoul) {
        int i = 0;

        for (i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                break;
            }
        }

        return String.format("김서방은 %d에 있다", i);
    }
}

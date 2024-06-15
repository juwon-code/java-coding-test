/**
 * title : 피로도
 */

package juwoncode.programmers.level2;

public class Fatigue {
    public static void main(String[] args) {
        System.out.print(solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }

    private static int answer;
    private static boolean[] visited;

    public static int solution(int point, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(0, point, dungeons);

        return answer;
    }

    private static void dfs(int depth, int point, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= point) {
                // 탐색한 인덱스를 true로 표시한다.
                visited[i] = true;
                // 깊이를 늘리고, 포인트를 낮춘다음 다음 인덱스를 탐색한다.
                dfs(depth + 1, point - dungeons[i][1], dungeons);
                // 탐색이 끝났을 경우 인덱스를 false로 초기화한다.
                visited[i] = false;
            }
        }

        // 깊이와 결과값을 비교하여 큰 값을 결과값에 반영한다.
        answer = Math.max(answer, depth);
    }
}

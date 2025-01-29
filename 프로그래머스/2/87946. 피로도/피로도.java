import java.util.*;

class Solution {
    int maxCount = 0; // 탐험할 수 있는 최대 던전 개수
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length]; // 방문 여부 배열
        dfs(k, dungeons, visited, 0);
        return maxCount;
    }
    
    private void dfs(int k, int[][] dungeons, boolean[] visited, int count) {
        maxCount = Math.max(maxCount, count); // 현재까지 탐험한 던전 개수 저장

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) { // 아직 방문하지 않았고, 최소 필요 피로도 만족
                visited[i] = true; // 방문 표시
                dfs(k - dungeons[i][1], dungeons, visited, count + 1); // 피로도 감소 후 다음 탐색
                visited[i] = false; // 백트래킹 (원상복구)
            }
        }
    }
}
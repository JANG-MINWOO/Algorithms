import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] map = new int[102][102];
        
        for (int[] rect : rectangle) {
            for (int x = rect[0] * 2; x <= rect[2] * 2; x++) {
                for (int y = rect[1] * 2; y <= rect[3] * 2; y++) {
                    map[x][y] = 1;
                }
            }
        }
        
        for (int[] rect : rectangle) {
            for (int x = rect[0] * 2 + 1; x < rect[2] * 2; x++) {
                for (int y = rect[1] * 2 + 1; y < rect[3] * 2; y++) {
                    map[x][y] = 0;
                }
            }
        }
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        int sx = characterX * 2, sy = characterY * 2;
        int ex = itemX * 2, ey = itemY * 2;
        
        boolean[][] visited = new boolean[102][102];
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sx, sy, 0});
        visited[sx][sy] = true;
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            
            if (cur[0] == ex && cur[1] == ey) return cur[2] / 2;
            
            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];
                
                if(nx >= 0 && nx < 102 && ny >= 0 && ny < 102 && map[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, cur[2] + 1});
                }
            }
        }
        return -1;
    }
}
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int dir = 0, x = 0, y = 0;
        int[] dx = {0, 1, 0, -1}; //순서대로 우 | 하 | 좌 | 상
        int[] dy = {1, 0, -1, 0};
        
        for (int i = 1; i <= n * n; i++) {
            answer[x][y] = i;
            
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            x = nx;
            y = ny;
        }
        return answer;
    }
}


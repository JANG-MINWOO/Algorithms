import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

class Solution {
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    
    public int solution(int[][] game_board, int[][] table) {
        int n = game_board.length;
        
        List<List<int[]>> blanks = extractPieces(game_board, n, 0); // 빈칸 추출
        List<List<int[]>> pieces = extractPieces(table, n, 1); // 퍼즐 추출
        
        boolean[] usedPiece = new boolean[pieces.size()];
        int answer = 0;
        
        for (List<int[]> blank : blanks) {
            for (int p = 0; p < pieces.size(); p++) {
                if (usedPiece[p]) continue;
                if (blank.size() != pieces.get(p).size()) continue;
                
                if (matchWithRotation(blank, pieces.get(p))) {
                    usedPiece[p] = true;
                    answer += blank.size();
                    break;
                }
            }
        }
        return answer;
    }
    
    List<List<int[]>> extractPieces(int[][] board, int n, int target) {
        boolean[][] visited = new boolean[n][n];
        List<List<int[]>> result = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == target && !visited[i][j]) {
                    List<int[]> piece = new ArrayList<>();
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{i, j}); //처음 발견칸을 큐에 넣고
                    visited[i][j] = true;
                    
                    while(!queue.isEmpty()) {
                        int[] cur = queue.poll();
                        piece.add(cur);
                        
                        for (int d = 0; d < 4; d++) {
                            int nx = cur[0] + dx[d];
                            int ny = cur[1] + dy[d];
                            
                            if (nx >= 0 && nx < n && ny >= 0 && ny < n 
                                && !visited[nx][ny] && board[nx][ny] == target) {
                                visited[nx][ny] = true;
                                queue.add(new int[]{nx, ny});
                            }
                        }
                    }
                    result.add(piece);
                }
            }
        }
        return result;
    }
    
    List<int[]> normalize(List<int[]> piece) {
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        for (int[] p : piece) {
            minX = Math.min(minX, p[0]);
            minY = Math.min(minY, p[1]);
        }
        List<int[]> normalized = new ArrayList<>();
        for (int[] p : piece) {
            normalized.add(new int[]{p[0] - minX, p[1] - minY});
        }
        
        normalized.sort((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        return normalized;
    }
    
    List<int[]> rotate(List<int[]> piece) {
        List<int[]> rotated = new ArrayList<>();
        for (int[] p : piece) {
            rotated.add(new int[]{p[1], -p[0]});
        }
        return normalize(rotated);
    }
    
    boolean matchWithRotation(List<int[]> blank, List<int[]> piece) {
        List<int[]> normalBlank = normalize(blank);
        List<int[]> rotated = normalize(piece);
        
        for (int r = 0; r < 4; r++) {
            if (isSame(normalBlank, rotated)) return true;
            rotated = rotate(rotated);
        }
        return false;
    }
    
    boolean isSame(List<int[]> a, List<int[]> b) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i)[0] != b.get(i)[0] || a.get(i)[1] != b.get(i)[1]) return false;
        }
        return true;
    }
}
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int length = board.length;
        int[][] newBoard = new int[length + 2][length + 2];
        
        
        for (int i = 0; i < length + 2; i++) { // 전체 보드를 스캔할건데
            for (int j = 0; j < length + 2; j++) {
                if (i == 0 || j == 0 || i == length + 1 || j == length + 1) { // 추가된 길이부분
                    newBoard[i][j] = 0; // 테두리는 전부 0 으로 넣고
                } else {
                    if (board[i - 1][j - 1] == 1) {
                        newBoard[i][j] = board[i - 1][j - 1] + 99; //내부는 똑같은 보드 복사 지뢰(1) + 99;
                    } else {
                        newBoard[i][j] = board[i - 1][j - 1];
                    }
                    
                }
            }
        }
        
        for (int i = 1; i < length + 1; i++) { // 새로만든 판의 내부만 스캔
            for (int j = 1; j < length + 1; j++) {
                if (newBoard[i][j] >= 100) {
                    
                    newBoard[i - 1][j - 1]++;
                    newBoard[i - 1][j]++;
                    newBoard[i - 1][j + 1]++;
                    newBoard[i][j - 1]++;
                    newBoard[i][j + 1]++;
                    newBoard[i + 1][j - 1]++;
                    newBoard[i + 1][j]++;
                    newBoard[i + 1][j + 1]++;
                    
                }
            }
        }
        
        for (int i = 1; i < length + 1; i++) {
            for (int j = 1; j < length + 1; j++) {
                if (newBoard[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row1 = arr1.length; // arr1 의 행 개수
        int col1 = arr1[0].length; // arr1 의 열 개수
        int col2 = arr2[0].length; // arr2 의 열 개수
        
        int[][] answer = new int[row1][col2];
        
        for (int i = 0; i < row1; i++) { // arr1 의 행부터 순회
            for (int j = 0; j < col2; j++) { // arr
                for (int k = 0; k < col1; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}

// arr1  arr2
// 1 4   3 3
// 3 2   3 3
// 4 1

// (N,M)*(M,J) 행렬은 (N,J)행렬로 되고 앞의 행렬의 열과 뒤 행렬의 행의 수가 일치해야됨
// arr1 의 행부터 시작해서 arr2 의열로 순회해야됨

// 15 15
// 15 15
// 15 15
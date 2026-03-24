class Solution {
    public int[][] solution(int[][] arr) {
        int length = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[length][length];
        if (arr.length == arr[0].length) return arr;
        if (length > arr[0].length) { //행의 수가 열의 수보다 크면
            for (int i = 0; i < arr[0].length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    answer[j][i] = arr[j][i];
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        return answer;
    }
}
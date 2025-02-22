class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int minX = 257;
        int maxX = -257;
        int minY = 257;
        int maxY = -257;
        
        for (int i = 0; i < 4; i++) {
            if (dots[i][0] > maxX) {
                maxX = dots[i][0];
            }
            if (dots[i][0] < minX) {
                minX = dots[i][0];
            }
            if (dots[i][1] > maxY) {
                maxY = dots[i][1];
            }
            if (dots[i][1] < minY) {
                minY = dots[i][1];
            }
        }
        answer = (maxX - minX) * (maxY - minY);
        
        return answer;
    }
}

//[1, 2] [2, 2]
//[1, 1] [2, 1]
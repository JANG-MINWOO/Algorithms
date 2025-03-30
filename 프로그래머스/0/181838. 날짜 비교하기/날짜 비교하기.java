class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int check = (date2[0] - date1[0]) * 365 + (date2[1] - date1[1]) * 30 + (date2[2] - date1[2]) * 1;
        if (check >= 1) {
            answer = 1;
        }
        return answer;
    }
}
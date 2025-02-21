class Solution {
    public int solution(int M, int N) {
        int answer1 = 0;
        int answer2 = 0;
        int answer = 0;
        
        if (M == 1) {
            return N - 1;
        } else if (N == 1) {
            return M - 1;
        }
        
        for (int i = 0; i < M - 1; i++) { // 가로길이가 M = 4 인경우
            answer1++; // M - 1 인 3번만큼 잘라야됨 그럼 종이 갯수는 4개가됨
        }
        
        for (int i = 0; i < N - 1; i++) { // 세로길이가 N = 3 인경우
            answer2++; // N - 1 인 2번만큼 잘라야됨
        }
        
        answer = answer1 + (answer2 * (answer1 + 1));
        
        return answer;
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;

        while (true) {
            answer++;
            if (makeFactorial(answer) > n) break;
        }
        return answer - 1;
    }
    
    private int makeFactorial(int num) {
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        return answer;
    }
}
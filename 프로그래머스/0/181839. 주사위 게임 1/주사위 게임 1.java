class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0) {
            answer = a * a + b * b;
        } else if (a % 2 != 0 || b % 2 != 0) {
            answer = 2 * (a + b);
        } else if (a % 2 == 0 && b % 2 == 0) {
            int minus = a - b;
            answer = Math.abs(minus);
        }
        return answer;
    }
}
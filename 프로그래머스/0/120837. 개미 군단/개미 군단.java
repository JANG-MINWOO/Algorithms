class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(hp > 0) {
            if (hp >= 5) {
                hp -= 5;
                answer++;
                continue;
            }
            if (hp >= 3) {
                hp -= 3;
                answer++;
                continue;
            }
            if (hp >= 1) {
                hp -= 1;
                answer++;
                continue;
            }
        }
        return answer;
    }
}
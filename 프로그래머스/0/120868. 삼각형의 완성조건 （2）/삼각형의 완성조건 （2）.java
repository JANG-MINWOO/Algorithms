class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]); // 가장 긴변이 sides 에 있는 경우에 사용
        int min = Math.min(sides[0], sides[1]);
        for (int i = 1; i < max; i++) {
            if (min + i > max) answer++;
        } // 주어진 두 수중에 하나가 가장 긴변 일때의 모든 경우의 수
        
        for (int i = max; i < min + max; i++) {
            if (min + max > i) answer++;
        }
        return answer;
    }
}
// 가장긴변 < 짧은 변 + 짧은 변
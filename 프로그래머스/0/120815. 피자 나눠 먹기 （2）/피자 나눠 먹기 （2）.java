class Solution {
    public int solution(int n) {
        int answer = 0;
        int slices = 6;
        while (true) {
            if (slices == n) {
                answer++;
                break;
            }
            
            if (slices % n != 0) {
                slices += 6;
                answer++;
                continue;
            } {
                answer++;
                break;
            }
        }
        return answer;
    }
} 
class Solution {
    public int solution(int[] common) {
        int answer = 0;
        boolean isArithmetic = false;
        boolean isGeometric = false;
        int gap = 0;
        
        if ((common[1] - common[0]) == (common[2] - common[1])) { // 등차수열 이면
            isArithmetic = true;
            gap = common[1] - common[0]; // 공차를 입력
        } else if ((common[1] / common[0]) == (common[2] / common[1])) { // 등비수열 이면
            isGeometric = true;
            gap = common[1] / common[0];
        }
        
        if (isArithmetic) {
            answer = common[common.length - 1] + gap;
        } else if (isGeometric) {
            answer = common[common.length - 1] * gap;
        }

        return answer;
    }
}

// -1 -2 -3
// -1 -2 -4
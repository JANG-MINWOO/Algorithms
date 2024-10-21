class Solution {
    public int solution(String s) {
        int answer = 0; 
        int xCount = 0; 
        int nonXCount = 0; 
        char x = s.charAt(0); 

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                xCount++;
            } else {
                nonXCount++;
            }

            if (xCount == nonXCount) {
                answer++; 
                if (i + 1 < s.length()) {
                    x = s.charAt(i + 1);
                }
                xCount = 0; // 카운터 초기화
                nonXCount = 0; // 카운터 초기화
            }
        }
        if (xCount != nonXCount) {
            answer++;
        }

        return answer;
    }
}


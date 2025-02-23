class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        if (A.equals(B)) return 0;
        for (int i = 0; i < A.length(); i++) {
            answer++;
            A = move(A);
            if (A.equals(B)) {
                return answer;
            }
        }
        if (answer == A.length()) {
            answer = -1;
        }
        return answer;
    }
    
    private String move(String A) {
        int n = A.length();
        String result = "" + A.substring(n - 1) + A.substring(0, n - 1);
        return result;
    }
}
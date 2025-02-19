class Solution {
    public int solution(int start, int end, int k) {
        int answer = 0;
        String check = String.valueOf(k);
        
        for (int i = start; i <= end; i++) {
            String number = String.valueOf(i);
            for (char ch : number.toCharArray()) {
                if (ch == check.charAt(0)) answer++;
            }
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int k) {
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < k; i++) {
            str.append(my_string);
        }
        String answer = str.toString();
        return answer;
    }
}
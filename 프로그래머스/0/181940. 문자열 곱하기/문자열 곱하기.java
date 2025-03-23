class Solution {
    public String solution(String my_string, int k) {
        StringBuilder sumStr = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sumStr.append(my_string);
        }
        String answer = sumStr.toString();
        return answer;
    }
}
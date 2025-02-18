class Solution {
    public String solution(String my_string) {
        String answer = "";
        int length = my_string.length();
        String[] strArr = my_string.split("");
        
        for (int i = length - 1; i >= 0; i--) {
            answer += strArr[i];
        }
        return answer;
    }
}
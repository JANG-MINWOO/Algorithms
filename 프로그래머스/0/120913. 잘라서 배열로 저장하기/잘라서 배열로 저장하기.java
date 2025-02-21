class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length();
        int newStringLength = 0;
        
        if (length % n == 0) {
            newStringLength = length / n;
        } else {
            newStringLength = length / n + 1;
        }
        
        int newStringIndex = 0;
        int count = 0;
        String[] answer = new String[newStringLength];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = "";
        }
        
        for (int i = 0; i < my_str.length(); i++) {
            answer[newStringIndex] += my_str.substring(i, i + 1);
            count++;
            if (count % n == 0) {
                newStringIndex++;
            }
        }
        
        return answer;
    }
}
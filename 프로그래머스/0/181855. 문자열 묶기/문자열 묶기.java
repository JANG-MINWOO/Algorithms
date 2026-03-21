import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int[] results = new int[30];
        
        for (int i = 0; i < strArr.length; i++) {
            results[strArr[i].length() - 1]++;
        }
        Arrays.sort(results);
        int answer = 0;
        for (int i = 29; i >= 0; i--) {
            answer = results[i];
            if (results[i] != 0) break;
        }
        
        return answer;
    }
}
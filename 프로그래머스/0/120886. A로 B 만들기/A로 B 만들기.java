import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        Map<String, Integer> beforeMap = new HashMap<>();
        Map<String, Integer> afterMap = new HashMap<>();
        
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        
        for (String s : beforeArr) {
            beforeMap.put(s, beforeMap.getOrDefault(s, 0) + 1);
        }
        
        for (String s : afterArr) {
            afterMap.put(s, afterMap.getOrDefault(s, 0) + 1);
        }
        Set<String> keySet = beforeMap.keySet();
        
        for (String s : keySet) {
            if (beforeMap.get(s) != afterMap.get(s)) answer = 0;
        }
        
        
        return answer;
    }
}
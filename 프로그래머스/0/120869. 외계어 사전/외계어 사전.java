import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        Map<String, Integer> spellMap = new HashMap<>();
        for (String key : spell) {
            spellMap.put(key, 1);
        }
        
        Set<String> keySet = spellMap.keySet();
        
        for (String key : dic) {
            Map<String, Integer> dicMap = new HashMap<>();
            String[] keys = key.split("");
            for (String s : keys) {
                dicMap.put(s, dicMap.getOrDefault(s, 0) + 1);
            }
            
            boolean isMatch = true;
            for (String key2 : keySet) {
                if (dicMap.get(key2) != spellMap.get(key2)) {
                    isMatch = false;
                    break; //키의 값이 하나라도 다르면 false 인 상태로 반복문 나감
                }
            }
            
            if (isMatch) return 1;
        }
        
        return 2;
    }
}
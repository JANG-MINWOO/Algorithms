import java.util.*;

class Solution {
    public String solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        String answer = "";
        
        for (String str : s.split("")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        } // 문자 - 갯수 map 생성
        
        //if (!(map.values()).contains("1")) return "";
        
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 97);
            String key = Character.toString(ch);
            if(map.containsKey(key) && map.get(key) == 1) { // a 부터 시작해서
                list.add(key);
            }
        }
        Collections.sort(list);
        
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        
        

        return answer;
    }
}
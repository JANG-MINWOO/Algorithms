import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] splited = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for (String s : splited) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        
        Collections.sort(list);
        
        String[] answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
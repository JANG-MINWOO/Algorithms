import java.util.*;

class Solution {
    public String solution(String my_string, String letter) {
        String[] strArr = my_string.split("");
        List<String> strList = new ArrayList<>();
        List<String> removeList = new ArrayList<>();
        String answer = "";
        
        for (String s : strArr) {
            strList.add(s);
        }
        removeList.add(letter);
        
        strList.removeAll(removeList);
        
        for (int i = 0; i < strList.size(); i++) {
            answer += strList.get(i);
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String my_string) {
        Set<String> set = new LinkedHashSet<>();
        String[] str = my_string.split("");
        String answer = "";
        
        for (String s : str) {
            set.add(s);
        }
        
        for (String s : set) {
            answer += s;
        }

        return answer;
    }
}
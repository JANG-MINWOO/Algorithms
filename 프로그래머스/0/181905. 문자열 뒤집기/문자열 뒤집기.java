import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String my_string, int s, int e) {
        List<String> list = new ArrayList<>();
        String[] sp = my_string.split("");
        
        for(String str : sp) {
            list.add(str);
        }
        Collections.reverse(list.subList(s, e + 1));
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        
        return sb.toString();
    }
}
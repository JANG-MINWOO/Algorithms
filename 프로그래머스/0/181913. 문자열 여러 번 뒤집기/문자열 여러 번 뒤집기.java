import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String my_string, int[][] queries) {
        List<String> list = new ArrayList<>();
        String[] split = my_string.split("");
        
        for (int i = 0; i < my_string.length(); i++) {
            list.add(split[i]);
        }
        
        for (int i = 0; i < queries.length; i++) {
            List<String> sub = list.subList(queries[i][0], queries[i][1] + 1);
            Collections.reverse(sub);
        }
        return String.join("", list);
    }
}
import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String[] splited = my_string.split("");
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < indices.length; i++) {
            splited[indices[i]] = "";
        }
        
        for (int i = 0; i < splited.length; i++) {
            if (!splited[i].equals("")) {
                list.add(splited[i]);
            }
        }
        
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < list.size(); i++) {
            str.append(list.get(i));
        }
        
        return str.toString();
    }
}
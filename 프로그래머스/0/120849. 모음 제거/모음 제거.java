import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<String> list = new ArrayList<>();
        String[] strArr = my_string.split("");
        List<String> check = new ArrayList<>();
        check.add("a");
        check.add("e");
        check.add("i");
        check.add("o");
        check.add("u");
        
        for (String s : strArr) {
            list.add(s);
        }
        
        list.removeAll(check);
        
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }

        return answer;
    }
}
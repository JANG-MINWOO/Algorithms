import java.util.*;

class Solution {
    public String solution(int age) {
        String convert = "" + age;
        char[] ch = convert.toCharArray();
        int check = 0;
        List<Character> list = new ArrayList<>();
        String answer = "";
        
        for (int i = 0; i < ch.length; i++) {
            check = (int) ch[i];
            check += 49;
            list.add((char) check);
        }
        
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        
        
        return answer;
    }
}
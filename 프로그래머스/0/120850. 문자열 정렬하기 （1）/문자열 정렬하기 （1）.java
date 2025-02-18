import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Character> list = new ArrayList<>(); 
        char[] ch = my_string.toCharArray();
        int check = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            check = (int) ch[i];
            if (check >= 48 && check <= 57) {
                list.add(ch[i]);
            }
        }
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Character.getNumericValue(list.get(i));
        }
        return answer;
    }
}

// 48 57
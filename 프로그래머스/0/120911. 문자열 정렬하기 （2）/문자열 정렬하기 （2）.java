import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] ch = my_string.toCharArray();
        List<Character> list = new ArrayList<>();
        int check = 0;
        String answer = "";
        
        for (int i = 0; i < ch.length; i++) {
            check = (int) ch[i];
            if (check < 91) { //아스키코드상 대문자라면
                check += 32; //소문자 아스키코드로 바꾸고
            }
            ch[i] = (char) check;
            list.add(ch[i]);
        } // 이까지 소문자 변환 및 리스트에 넣기완료

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }
}
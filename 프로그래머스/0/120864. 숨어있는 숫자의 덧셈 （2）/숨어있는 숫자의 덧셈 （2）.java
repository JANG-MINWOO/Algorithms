import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        List<Character> list = new ArrayList<>();
        String converted = "";
        String cleaned = "";
        
        for (char ch : my_string.toCharArray()) {
            if ((int) ch > 57) {
                ch = ',';
            }
            list.add(ch); 
        } // 영어는 , 로 변환한 뒤 list 에 추가하고 숫자는 그냥 추가함 a1b2CC3 은 ,1,2,,3 으로 저장됨
        
        for (int i = 0; i < list.size(); i++) {
            converted += Character.toString(list.get(i));
        } // String 으로 값을 쌓기
        
        cleaned = converted.replaceAll(",+", ",");
        String[] numbers = cleaned.split(",");
        
        for (String s : numbers) {
            if (!s.isEmpty()) {
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}
import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> skipSet = new HashSet<>();
        for(char c : skip.toCharArray()) {
            skipSet.add(c); //skip문자열을 Set에 저장
        }
        
        StringBuilder result = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            int step = 0;
            char currentChar = c;
        
            while (step < index) {
                currentChar++;
                if(currentChar>'z'){
                    currentChar='a';
                }
                if(!skipSet.contains(currentChar)){//skip 하는 문자가 아닐때만 step 이 증가해서 index 만큼 옮기게 함
                    step++;
                }
            }
            result.append(currentChar);
        }
        return result.toString();
    }
}
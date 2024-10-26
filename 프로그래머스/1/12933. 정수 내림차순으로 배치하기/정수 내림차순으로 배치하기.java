import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s=""+n; //n을 문자열에 넣기
        String[] str = s.split("");//문자열을 문자열배열에 넣기
        Arrays.sort(str, Collections.reverseOrder()); //내림차순정렬
        String result="";
        
        for(String a: str)
            result+=a;
        
        answer=Long.parseLong(result);            
        return answer;
    }
}
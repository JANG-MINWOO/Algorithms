import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String sum = Integer.toString(n);
        for(int i=0;i<sum.length();i++){
            answer+=Integer.parseInt(sum.substring(i,i+1));
        }
        return answer;
    }
}
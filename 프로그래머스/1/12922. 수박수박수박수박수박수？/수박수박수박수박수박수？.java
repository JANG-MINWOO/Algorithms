import java.util.stream.Stream;
import java.util.stream.Collectors;
class Solution {
    public String solution(int n) {
        String answer = Stream.generate(()->"수박")
            .limit((n+1)/2)
            .collect(Collectors.joining());
        
        return answer.substring(0,n);
    }
}
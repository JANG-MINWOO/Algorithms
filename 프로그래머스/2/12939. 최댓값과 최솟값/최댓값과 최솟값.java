import java.util.*;

class Solution {
    public String solution(String s) {
        String result = " ";
        int[] numbers = Arrays.stream(s.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        
        return min + result + max;
    }
}
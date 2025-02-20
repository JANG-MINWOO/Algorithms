import java.util.*;

class Solution {
    public Integer[] solution(int n) {
        Set<Integer> set = new LinkedHashSet<>();
        
        for (int i = 2; i <= n; i++) {
            if (n == 1) {
                break;
            }
            while (n % i == 0) {
                n /= i;
                set.add(i);
            }
        }

        Integer[] answer = set.toArray(new Integer[set.size()]);

        return answer;
    }
}
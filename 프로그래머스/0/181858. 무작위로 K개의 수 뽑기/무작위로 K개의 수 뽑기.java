import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        int idx = 0;
        
        for (int num : arr) {
            if (idx >= k) break;
            if (!set.contains(num)) {
                set.add(num);
                answer[idx++] = num;
            }
        }
        return answer;
    }
}
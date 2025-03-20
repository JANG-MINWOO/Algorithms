import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        List<Integer> list = new ArrayList<>();
        
        for (int num : num_list) {
            list.add(num);
        }
        
        Collections.sort(list);
        
        for (int i = 0; i < 5; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
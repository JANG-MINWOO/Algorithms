import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        
        Collections.sort(list);
        int[] answer = new int[list.size() - 5];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i + 5);
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        int index = 1;
        List<Integer> list = new ArrayList<>();
        
        while (true) {
            list.add(k * index);
            index++;
            if (k * index > n) break;
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
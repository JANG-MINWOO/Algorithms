import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int length = array.length;
        List<Integer> list = new ArrayList<>();
        
        for (int i : array) {
            list.add(i);
        }
        
        Collections.sort(list);
        answer = list.get(length / 2);
        return answer;
    }
}
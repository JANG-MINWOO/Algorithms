import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        
        for (int i : numlist) {
            list.add(i);
        }
        
        for (int i = numlist.length - 1; i >= 0; i--) {
            if (numlist[i] % n != 0) {
                list.remove(i);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
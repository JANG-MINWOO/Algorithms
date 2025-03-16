import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {

        Set<Integer> deleteSet = new HashSet<>();
        
        for (int num : delete_list) {
            deleteSet.add(num);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                list.add(num);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
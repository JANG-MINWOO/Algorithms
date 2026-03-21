import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (start == -1 && arr[i] == 2) {
                start = i;
            } else if (arr[i] == 2) {
                end = i;
            }
        }
        
        if (start == -1) return new int[]{-1};
        if (end == -1) return new int[]{arr[start]};
        List<Integer> list = new ArrayList<>();
        
        for (int i = start; i <= end; i++) {
            list.add(arr[i]);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
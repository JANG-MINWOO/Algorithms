import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        int start1 = intervals[0][0];
        int end1 = intervals[0][1] + 1;
        int start2 = intervals[1][0];
        int end2 = intervals[1][1] + 1;
        
        for (int i = start1; i < end1; i++) {
            list.add(arr[i]);
        }
        for (int i = start2; i < end2; i++) {
            list.add(arr[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
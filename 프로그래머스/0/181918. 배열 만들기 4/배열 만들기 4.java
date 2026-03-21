import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty()) {
                list.add(arr[i]);
            } else if (!list.isEmpty() && list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
            } else if (!list.isEmpty() && list.get(list.size() - 1) >= arr[i]) {
                list.remove(list.size() - 1);
                i--;
            }
        }
        return list.stream().mapToInt(j -> j).toArray();
    }
}
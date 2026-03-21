import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (list.size() == 0) {
                list.add(arr[i]);
                i++;
            } else if (list.size() != 0 && (list.get(list.size() - 1) == arr[i])) {
                list.remove(list.size() - 1);
                i++;
            } else if (list.size() != 0 && (list.get(list.size() - 1) != arr[i])) {
                list.add(arr[i]);
                i++;
            }
        }
        if (list.size() == 0) return new int[]{-1};
        return list.stream().mapToInt(k -> k).toArray();
    }
}
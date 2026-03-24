import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (i % 5 != 0) continue;
            String s = "" + i;
            if (s.matches("[05]+")) list.add(i);
        }
        if (list.size() != 0) return list.stream().mapToInt(j -> j).toArray();
        return new int[]{-1};
    }
}
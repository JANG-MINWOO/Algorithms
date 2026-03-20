import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            int a = Integer.parseInt(intStrs[i].substring(s ,s + l));
            if (a > k) list.add(a);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
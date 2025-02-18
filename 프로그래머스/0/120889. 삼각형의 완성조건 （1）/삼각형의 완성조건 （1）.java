import java.util.*;

class Solution {
    public int solution(int[] sides) {
        List<Integer> lengthList = new ArrayList<>();
        for (int i : sides) {
            lengthList.add(i);
        }
        Collections.sort(lengthList);
        
        if(lengthList.get(2) < lengthList.get(0) + lengthList.get(1)) return 1;
        return 2;
    }
}
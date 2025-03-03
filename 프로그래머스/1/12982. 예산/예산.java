import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < d.length; i++) {
            list.add(d[i]);
        }
        
        Collections.sort(list); // 오름차순으로 정렬
        
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
            count++;
            if (answer > budget) {
                return count - 1;
            }
        }
        return count;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Set<Integer> leftSet = new HashSet<>();
        Map<Integer, Integer> rightMap = new HashMap<>();
        
        for (int t : topping) {
            rightMap.put(t, rightMap.getOrDefault(t, 0) + 1);
        }
        
        for (int t : topping) {
            leftSet.add(t);
            
            rightMap.put(t, rightMap.get(t) - 1);
            if (rightMap.get(t) == 0) {
                rightMap.remove(t);
            }
            
            if (leftSet.size() == rightMap.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}
// 1 1 1 1 1 1 2 에서도 1 6개와 2개라도 나눠지면 적절하다고 판단함
// 배열을 절반으로 나눠서 set 에 넣어보고 양쪽셋의 크기가 너무 다르면 자르는 기준을 바꿔보기?
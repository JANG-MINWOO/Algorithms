import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int index = 0;
        int[] sortedNum = new int[emergency.length];
        
        Map<Integer, Integer> map = new HashMap<>(); // emergency, 순위
        List<Integer> list = new ArrayList<>();
        
        for (int i : emergency) {
            list.add(i);
        }
        
        Collections.sort(list); // 중요도 오름차순으로 정렬
        
        for (int i = answer.length - 1; i >= 0; i--) {
            sortedNum[index] = list.get(i);
            index++;
        } // 중요도 정렬된 array 현재 sortedNum 은 76 24 3 이렇게 정렬됨
        
        index = 0; // 초기화
        
        for (int i = 0; i < answer.length; i++) {
            map.put(sortedNum[i], index + 1);
            index++;
        } // 맵에 76-1, 24-2, 3-3 이렇게 저장
        
        index = 0; // 초기화
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int size : tangerine) {
            frequencyMap.put(size,frequencyMap.getOrDefault(size,0)+1);
        } //사이즈별 빈도를 Map에 저장
        
        List<Integer> frequencyList = new ArrayList<>(frequencyMap.values()); //위에 선언한 Map 의 값의 리스트
        frequencyList.sort(Collections.reverseOrder());
        
        int answer = 0;
        int selected = 0;
        for (int freq : frequencyList) {
            selected += freq; // 현재 크기의 귤 개수 선택
            answer++;          // 선택된 종류 수 증가
            if (selected >= k) { // 필요한 귤 개수를 만족하면 종료
                break;
            }
        }
        return answer;
    }
}

//1. 귤 크기별 빈도계산
//2. 빈도를 내림차순으로 정렬(Map 을 List 로 변환해서)
//3. 
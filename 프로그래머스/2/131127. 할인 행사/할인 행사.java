import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        // 필요 제품과 수량을 저장하는 맵
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        // 슬라이딩 윈도우 맵
        Map<String, Integer> windowMap = new HashMap<>();
        
        // 초기 10일간의 데이터를 윈도우에 추가
        for (int i = 0; i < 10; i++) {
            windowMap.put(discount[i], windowMap.getOrDefault(discount[i], 0) + 1);
        }
        
        for (int i = 0; i <= discount.length - 10; i++) {
            // wantMap 이랑 windowMap 비교
            if (matches(wantMap, windowMap)) {
                answer++;
            }
            
            if (i + 10 < discount.length) {
                // 윈도우 맨앞상품 제거
                String removeProduct = discount[i];
                windowMap.put(removeProduct, windowMap.get(removeProduct) - 1);
                if (windowMap.get(removeProduct) == 0) {
                    windowMap.remove(removeProduct);
                }
                
                String addProduct = discount[i+10];
                windowMap.put(addProduct, windowMap.getOrDefault(addProduct, 0) + 1);
            }
        }
        return answer;
    }
    
    // 두 맵이 동일한지 확인하는 메서드
    private boolean matches(Map<String, Integer> wantMap, Map<String, Integer> windowMap) {
        for (String key : wantMap.keySet()) {
            if (windowMap.getOrDefault(key, 0) < wantMap.get(key)) {
                return false;
            }
        }
        return true;
    }
}
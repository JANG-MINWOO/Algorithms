import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int baseTime = fees[0];   // 기본 시간(분)
        int baseFee = fees[1];    // 기본 요금(원)
        int unitTime = fees[2];   // 단위 시간(분)
        int unitFee = fees[3];    // 단위 요금(원)
        
        // 차량별 누적 주차 시간을 저장할 맵
        Map<String, Integer> totalTimeMap = new HashMap<>();
        // 차량별 입차 시각(분)을 저장할 맵
        Map<String, Integer> inTimeMap = new HashMap<>();
        
        // records 배열을 순회하며 입/출차 처리
        for (String record : records) {
            String[] parts = record.split(" ");
            String timeStr = parts[0];
            String car = parts[1];
            String action = parts[2];
            
            int time = convertTimeToMinutes(timeStr);
            
            if (action.equals("IN")) {
                inTimeMap.put(car, time);
            } else { // OUT
                int inTime = inTimeMap.get(car);
                int duration = time - inTime;
                totalTimeMap.put(car, totalTimeMap.getOrDefault(car, 0) + duration);
                inTimeMap.remove(car);
            }
        }
        
        // 출차 기록이 없는 차량은 23:59에 출차한 것으로 간주 (23:59 = 23*60 + 59 = 1439분)
        int endOfDay = 23 * 60 + 59;
        for (String car : inTimeMap.keySet()) {
            int inTime = inTimeMap.get(car);
            int duration = endOfDay - inTime;
            totalTimeMap.put(car, totalTimeMap.getOrDefault(car, 0) + duration);
        }
        
        // 차량 번호를 오름차순으로 정렬 (문자열 정렬)
        List<String> carList = new ArrayList<>(totalTimeMap.keySet());
        Collections.sort(carList);
        
        int[] answer = new int[carList.size()];
        for (int i = 0; i < carList.size(); i++) {
            String car = carList.get(i);
            int totalMinutes = totalTimeMap.get(car);
            int fee = baseFee;
            if (totalMinutes > baseTime) {
                // 초과 시간에 대해 단위 시간마다 단위 요금을 적용 (올림)
                fee += Math.ceil((double)(totalMinutes - baseTime) / unitTime) * unitFee;
            }
            answer[i] = fee;
        }
        
        return answer;
    }
    
    // "HH:MM" 형식을 분으로 변환하는 헬퍼 메서드
    private int convertTimeToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}
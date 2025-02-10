import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int baseTime = fees[0];
        int baseFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        
        Map<String, Integer> totalTimeMap = new HashMap<>();
        Map<String, Integer> inTimeMap = new HashMap<>();
        
        for (String record : records) {
            String[] parts = record.split(" ");
            String timeStr = parts[0];
            String car = parts[1];
            String action = parts[2];
            
            int time = convertTime(timeStr);
            
            if (action.equals("IN")) {
                inTimeMap.put(car, time);
            } else {
                int inTime = inTimeMap.get(car);
                int duration = time - inTime;
                totalTimeMap.put(car, totalTimeMap.getOrDefault(car, 0) + duration);
                inTimeMap.remove(car); //총 주차시간 기록 후 바로 앞 입차시간 삭제
            }
        }
        
        int endOfDay = 23 * 60 + 59;
        for (String car : inTimeMap.keySet()) {
            int inTime = inTimeMap.get(car);
            int duration = endOfDay - inTime;
            totalTimeMap.put(car, totalTimeMap.getOrDefault(car, 0) + duration);
        }
        
        List<String> carList = new ArrayList<>(totalTimeMap.keySet());
        Collections.sort(carList);
        
        int[] answer = new int[carList.size()];
        for (int i = 0; i < carList.size(); i++) {
            String car = carList.get(i);
            int totalMinutes = totalTimeMap.get(car);
            int fee = baseFee;
            
            if (totalMinutes > baseTime) {
                fee += Math.ceil((double) (totalMinutes - baseTime) / unitTime) * unitFee;
            }
            answer[i] = fee;
        }
        return answer;
    }
    
    private int convertTime (String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hour * 60 + minutes;
    }
}

// 기본 시간(분)
// 기본 요금(원)
// 단위 시간(분)
// 단위 요금(원)
// 차량별 누적 주차 시간을 저장할 맵
// 차량별 입차 시각(분)을 저장할 맵
// records 배열을 순회하며 입/출차 처리
// records 배열에 들어있는 값을 분리해서 가공해서 사용할 수 있도록 설정
// 입출차 시간을 분으로 환산
// 입차시간으로 된 기록은 intimeMap에 기입
// 출차시간으로 된 기록은 입차시간 맵에서 입차시간을 빼온 뒤 출차시간을 빼서 누적시간 계산
// 누적시간 맵에 차량과 시간을 누적해서 넣기

// 출차 기록이 없는 차량은 23:59에 출차한 것으로 간주 (23:59 = 23*60 + 59 = 1439분)
// car 번호를 담을 리스트 하나 만듦
// 차량 번호를 오름차순으로 정렬 (문자열 정렬)

// 정답배열을 만듦
// carList 기준으로 0부터 n인덱스까지 순회하면서 시간이랑 금액 계산
// 총 시간이 기본 시간 보다 클경우는 초과금액 계산 필요

// 초과 시간에 대해 단위 시간마다 단위 요금을 적용 (올림)
// "HH:MM" 형식을 분으로 변환하는 헬퍼 메서드
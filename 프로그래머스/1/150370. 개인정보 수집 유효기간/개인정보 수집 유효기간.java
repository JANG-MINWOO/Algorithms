import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // 오늘 날짜를 정수형으로 변환
        int todayInt = convertToInt(today);

        // 약관 종류와 유효기간을 해시맵에 저장
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            int collectedDateInt = convertToInt(parts[0]);
            String termType = parts[1];

            // 유효 기간 계산
            int termMonths = termMap.get(termType);
            int expiryDateInt = addMonths(collectedDateInt, termMonths);

            // 만료일이 오늘 날짜보다 이전이거나 같은 경우에만 파기 대상 추가
            if (expiryDateInt <= todayInt) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // 날짜를 "YYYY.MM.DD" 형식에서 정수형으로 변환
    private int convertToInt(String date) {
        return Integer.parseInt(date.replace(".", ""));
    }

    private int addMonths(int dateInt, int months) {
        int year = dateInt / 10000;
        int month = (dateInt / 100) % 100;
        int day = dateInt % 100;

        month += months;

        // 연도와 월 처리
        while (month > 12) {
            month -= 12;
            year++;
        }

        // 만료일 계산 시, 월에 따라 날짜 조정이 필요할 수 있음
        // 단순히 하루를 더하는 것이 아니라, 날짜를 그대로 유지해야 함
        // 월이 변경되면 해당 월의 마지막 날짜를 고려해야 할 수 있음

        // 정수형으로 다시 변환하여 반환
        return year * 10000 + month * 100 + day;
    }
}

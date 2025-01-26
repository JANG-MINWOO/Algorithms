import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> daysQueue = new LinkedList<>();

        // 1. 각 작업의 완료일 계산
        for (int i = 0; i < progresses.length; i++) {
            int remainingWork = 100 - progresses[i];
            int days = (remainingWork + speeds[i] - 1) / speeds[i]; // 올림 계산
            daysQueue.offer(days); // 완료일을 큐에 추가
        }

        // 2. 배포 계산
        while (!daysQueue.isEmpty()) {
            int currentBatchDay = daysQueue.poll(); // 기준이 되는 첫 번째 작업 완료일
            int count = 1; // 현재 배포 그룹의 작업 개수

            // 뒤의 작업들이 함께 배포될 수 있는지 확인
            while (!daysQueue.isEmpty() && daysQueue.peek() <= currentBatchDay) {
                daysQueue.poll(); // 함께 배포될 작업 제거
                count++;
            }

            result.add(count); // 현재 배포 그룹의 작업 수 저장
        }

        // 3. 결과 변환 및 반환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
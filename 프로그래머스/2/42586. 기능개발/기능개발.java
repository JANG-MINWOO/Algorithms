import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> daysQueue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remainingWork = 100 - progresses[i];
            int days = (remainingWork + speeds[i] - 1) / speeds[i];
            daysQueue.offer(days); //완료되는 날을 큐에 추가하기
        }
        
        while (!daysQueue.isEmpty()) {
            int currentBatchDay = daysQueue.poll();
            int count = 1; // 현재 배포그룹의 작업 개수
            
            while (!daysQueue.isEmpty() && daysQueue.peek() <= currentBatchDay) {
                daysQueue.poll();
                count++;
            }
            result.add(count); // 현재 배포 그룹의 작업 수 저장
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
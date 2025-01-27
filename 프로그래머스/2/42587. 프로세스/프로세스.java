import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        // 프로세스를 관리하기 위해 큐를 선언
        Queue<Process> queue = new LinkedList<>();
        
        // 큐에 프로세스를 삽입 (우선순위와 위치 정보 포함)
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Process(i, priorities[i]));
        }
        
        int order = 0; // 실행 순서를 기록
        
        while (!queue.isEmpty()) {
            Process current = queue.poll(); // 큐의 첫 번째 프로세스를 꺼냄
            
            // 큐 안에 우선순위가 더 높은 프로세스가 있는지 확인
            if (queue.stream().anyMatch(p -> p.priority > current.priority)) {
                // 우선순위 높은 프로세스가 있다면 현재 프로세스를 다시 큐에 추가
                queue.offer(current);
            } else {
                // 현재 프로세스를 실행
                order++;
                if (current.index == location) {
                    // 실행된 프로세스가 우리가 찾는 프로세스라면 실행 순서 반환
                    return order;
                }
            }
        }
        
        return -1; // 정상적으로 실행되지 않는 경우 (예외 상황)
    }
}

// 프로세스를 나타내는 클래스
class Process {
    int index;      // 프로세스의 위치
    int priority;   // 프로세스의 우선순위

    Process(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}
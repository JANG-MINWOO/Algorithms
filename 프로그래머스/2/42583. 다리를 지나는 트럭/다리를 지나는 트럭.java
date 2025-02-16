import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int current_weight = 0;
        int index = 0;
        
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        
        while (!bridge.isEmpty()) { // 모든 트럭이 다리를 건널 때까지 반복
            time++;
            
            current_weight -= bridge.poll(); // 다리 건넌 트럭은 제거
            
            if (index < truck_weights.length) {
                int nextTruck = truck_weights[index];
                
                // 새로운 트럭이 다리에 올라갈 수 있는지 확인
                if (current_weight + nextTruck <= weight) {
                    bridge.offer(nextTruck);
                    current_weight += nextTruck;
                    index++;
                } else {
                    bridge.offer(0);
                }
            }
        }
        
        return time;
    }
}
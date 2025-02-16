import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int index = 0;
        int current_weight = 0;
        
        Queue<Integer> bridge = new LinkedList<>();
        
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        
        while (!bridge.isEmpty()) {
            answer++;
            current_weight -= bridge.poll(); // 가장 먼저들어간 차 나가고 그만큼 무게 빼기
            if (index < truck_weights.length) {
                int nextTruck = truck_weights[index];
                
                if (current_weight + nextTruck <= weight) {
                    bridge.offer(nextTruck);
                    index++;
                    current_weight += nextTruck;
                } else {
                    bridge.offer(0);
                }
            }
        } 
        return answer;
    }
}
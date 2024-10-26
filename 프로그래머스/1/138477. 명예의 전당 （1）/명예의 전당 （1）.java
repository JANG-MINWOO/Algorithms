import java.util.PriorityQueue;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();
        
        for(int i = 0; i<score.length; i++){
            hallOfFame.add(score[i]);
            
            if(hallOfFame.size()>k){
                hallOfFame.poll(); //최소값을 제거하는 메서드
            }
            answer[i]=hallOfFame.peek();
        }
        return answer;
    }
}
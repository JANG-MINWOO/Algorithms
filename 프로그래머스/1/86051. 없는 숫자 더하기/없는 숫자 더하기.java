import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i:numbers){
            arrList.add(i);
        }
        
        for(int i=0;i<10;i++){
            if(!arrList.contains(i)){
                answer+=i;
            }
        }
        return answer;
    }
}
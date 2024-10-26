import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1){
            return new int[]{-1};
        }
        
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i : arr){
            arrList.add(i);
        }
        
        int min = Collections.min(arrList);
        arrList.remove(Integer.valueOf(min));
        
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        
        return answer;
    }
}
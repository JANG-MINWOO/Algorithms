import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int check = 1;
        int count = 0;
        
        while(true) {
            if (check <= length && check * 2 > length) break;
            check *= 2;
            count++;
        } // 4 ->  1 <= a < 2 false -> check 2, count 1 -> 2 <= 4 < 4 false -> check 4, count 2 -> 4 <= 4 < 8
        if (count == 0) return arr; 
        
        int count2 = 0;
        
        for (int i = 0; i < count; i++) {
            count2 = check * 2 - length;
        }
        List<Integer> list = new ArrayList<>();
        
        for (int i: arr) {
            list.add(i);
        }
        for (int i = 0; i < count2; i++) {
            if (check == length) break;
            list.add(0);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int check = 1;
        int theLengthIsUnderThan = 0;
        boolean pass = false;
        
        if (length == 1) {
            pass = true;
            return arr;
        }
        
        while (check < 1024) {
            check *= 2;
            if (length == check) {
                pass = true;
                break;
            } else if (length < check) {
                theLengthIsUnderThan = check;
                break;
            }
        }
        if (pass) {
            return arr;
        }
        List<Integer> list = new ArrayList<>();
        
        for (int i : arr) {
            list.add(i);
        }
        
        for (int i = 0; i < theLengthIsUnderThan - length; i++) {
            list.add(0);
        }
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
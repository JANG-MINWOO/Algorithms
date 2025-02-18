import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int count = 0;
        int originalLength = array.length;
        
        List<Integer> list = new ArrayList<>();
        
        for (int i : array) {
            list.add(i);
        }
        
        for (int i = array.length - 1; i >= 0; i--) {
            if (list.get(i) == n) {
                count++;
            }
        }
        
        return count;
    }
}
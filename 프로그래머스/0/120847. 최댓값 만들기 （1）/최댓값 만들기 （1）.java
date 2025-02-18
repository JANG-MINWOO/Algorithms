import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int length = numbers.length;
        
        List<Integer> numbersList = new ArrayList<>();
        for (int num : numbers) {
            numbersList.add(num);
        }
        Collections.sort(numbersList);
        if (numbersList.get(length - 1) == 0 || numbersList.get(length -2) == 0) return 0;
        answer = numbersList.get(length - 1) * numbersList.get(length -2);
        return answer;
    }
}
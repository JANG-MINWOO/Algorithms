import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int length = numbers.length;
        
        List<Integer> list = new ArrayList<>();
        for (int i : numbers) {
            list.add(i);
        }
        
        Collections.sort(list); // 리스트로 만들어서 의미상 오름차순 정렬까지
        
        int num1 = 0;
        int num2 = 0;
        
        if (list.get(0) * list.get(1) < 0) return list.get(0) * list.get(1);
        
        if (list.get(0) * list.get(1) > 0) {
            num1 = list.get(0) * list.get(1);
        }

        num2 = list.get(length - 1) * list.get(length - 2);
        
        answer = Math.max(num1, num2);
        
        return answer;
    }
} 
// -5 1
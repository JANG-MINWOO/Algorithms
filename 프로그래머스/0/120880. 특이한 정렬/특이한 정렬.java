import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        List<int[]> absList = new ArrayList<>();
        boolean isPlusMinus = false;
        
        for (int i = 0; i < numlist.length; i++) {
            absList.add(new int[] {Math.abs(numlist[i] - n), numlist[i]});
        } // 두수의 차이의 절대값과 그 숫자를 기입
        
        absList.sort((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]); //거리가 같으면 숫자가 큰순서가 먼저오도록
            }
            return Integer.compare(a[0], b[0]);
        });
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = absList.get(i)[1];
        }
        
        return answer;
    }
}
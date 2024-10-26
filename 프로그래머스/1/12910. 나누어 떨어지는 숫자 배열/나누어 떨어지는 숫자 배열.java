import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();

        // arr의 각 요소를 검사하여 나누어 떨어지는 경우 answer에 추가
        for (int i : arr) {
            if (i % divisor == 0) {
                answer.add(i);
            }
        }

        if (answer.isEmpty()) {
            return new int[] {-1}; // 새로운 배열로 반환
        }

        // answer 오름차순 정렬
        Collections.sort(answer);

        // ArrayList를 int 배열로 변환하여 반환
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
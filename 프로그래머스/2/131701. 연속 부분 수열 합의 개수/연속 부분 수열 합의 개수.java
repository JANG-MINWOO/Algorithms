import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        Set<Integer> uniqueSums = new HashSet<>();
        
        int[] circular = new int[2 * n];
        for (int i = 0; i < n; i++) {
            circular[i] = circular[i + n] = elements[i];
        } // 원형 수열을 두배로 만들기

        for (int length = 1; length <= n; length++) { // 부분 수열 길이
            for (int start = 0; start < n; start++) { // 시작 인덱스
                int sum = 0;
                for (int k = 0; k < length; k++) { // 부분 수열 합
                    sum += circular[start + k];
                }
                uniqueSums.add(sum);
            }
        }
        return uniqueSums.size();
    }
}
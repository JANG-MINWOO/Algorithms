import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 오름차순
        int n = citations.length; //논문 편수

        for(int i=0; i<n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                return h;    
            }
        }
        return 0;
    }
}
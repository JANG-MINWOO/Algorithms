class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minDiff = Math.abs(array[0] - n);
        
        for (int i = 0; i < array.length; i++) {
            int diff = Math.abs(array[i] - n);
            if (minDiff > diff) {
                minDiff = diff;
                answer = array[i];
            } else if ( minDiff == diff && answer > array[i]) {
                answer = array[i];
            }
        }
        return answer;
    }
}
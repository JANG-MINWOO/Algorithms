class Solution {
    public int[] solution(int[] array) {
        int index = 0;
        int maxNumber = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
                index = i;
            }
        }
        
        int[] answer = {maxNumber, index};
        return answer;
    }
}
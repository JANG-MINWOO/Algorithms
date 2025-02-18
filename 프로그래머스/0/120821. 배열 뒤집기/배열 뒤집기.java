class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length];
        int index = 0;
        
        for (int i = length - 1; i >= 0; i--) {
            answer[index] = num_list[i];
            index++;
        }
        return answer;
    }
}
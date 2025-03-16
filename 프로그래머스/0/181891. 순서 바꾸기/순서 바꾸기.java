class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int length = num_list.length;
        
        for (int i = 0; i < length; i++) {
            if ((i + n) >= length) {
                answer[i] = num_list[i + n - length];
            } else {
                answer[i] = num_list[i + n];
            }
            
        }
        return answer;
    }
}
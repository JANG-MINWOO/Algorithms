class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int length = num_list.length;
        
        for (int i = 0; i < answer.length; i++) {
            if (i == answer.length - 1) {
                if (num_list[length - 2] < num_list[length - 1]) {
                    answer[i] = num_list[length - 1] - num_list[length - 2];
                } else {
                    answer[i] = num_list[length - 1] * 2;
                }
            } else {
                answer[i] = num_list[i];
            }
        }
        return answer;
    }
}
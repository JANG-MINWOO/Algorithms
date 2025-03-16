class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int length = num_list.length;
        if (length > 10) {
            for (int i = 0; i < length; i++) {
                answer += num_list[i];
            }
            answer --;
        } else {
            for (int i = 0; i < length; i++) {
                answer *= num_list[i];
            }
        }
        return answer;
    }
}
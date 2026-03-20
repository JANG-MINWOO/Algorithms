class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            int count = 0;
            int check = num_list[i];
            if (check == 1) continue;
            while(true) {
                if (check % 2 == 0) {
                    check /= 2;
                    count++;
                } else {
                    check = (check - 1) / 2;
                    count++;
                }
                if (check == 1) {
                    answer += count;
                    break;
                }
            }
        }
        return answer;
    }
}
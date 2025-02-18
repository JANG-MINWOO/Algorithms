class Solution {
    public int[] solution(int money) {
        int count = 0;
        int remaining = money;
        while(remaining >= 5500) {
            remaining -= 5500;
            count++;
        }
        int[] answer = {count, remaining};
        return answer;
    }
}
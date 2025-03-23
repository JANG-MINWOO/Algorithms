class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 1;
        int squareSum = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            sum *= num_list[i];
            squareSum += num_list[i];
        }
        if (sum < squareSum * squareSum) {
            return 1;
        } else {
            return 0;
        }
    }
}
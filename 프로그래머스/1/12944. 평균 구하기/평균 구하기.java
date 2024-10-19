class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i : arr){
            answer += i;
        }
        answer= (double) answer/ arr.length;
        return answer;
    }
}
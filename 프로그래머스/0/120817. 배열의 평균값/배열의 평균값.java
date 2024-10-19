class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int number:numbers){
            answer=answer+number;
        }
        double length = numbers.length;
        answer=answer/length;
        return answer;
    }
}
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if (direction.equals("right")) {
            for (int i = 1; i < answer.length; i++) {
                answer[i] = numbers[i - 1];
            }
            answer[0] = numbers[numbers.length - 1];
        } else {
            for (int i = 1; i < answer.length; i++) {
                answer[i - 1] = numbers[i];
            }
            answer[numbers.length - 1] = numbers[0];
        }
        return answer;
    }
}
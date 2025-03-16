class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] numbers = binomial.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[2]);
        
        if (numbers[1].equals("+")) {
            answer = a + b;
        } else if (numbers[1].equals("-")) {
            answer = a - b;
        } else {
            answer = a * b;
        }
        return answer;
    }
}
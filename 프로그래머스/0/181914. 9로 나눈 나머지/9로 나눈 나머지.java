class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] numArr = number.split("");
        
        for (int i = 0; i < numArr.length; i++) {
            sum += Integer.parseInt(numArr[i]);
        }
        
        answer = sum % 9;
        return answer;
    }
}
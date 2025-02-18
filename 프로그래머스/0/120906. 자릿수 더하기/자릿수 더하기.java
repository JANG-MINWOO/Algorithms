class Solution {
    public int solution(int n) {
        int answer = 0;
        String number = "" + n;
        String[] numberArr = number.split("");
        
        for (String s : numberArr) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}
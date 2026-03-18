class Solution {
    public int solution(String number) {
        String[] str = number.split("");
        int answer = 0;
        
        for (String s : str) {
            answer += Integer.parseInt(s);
        }
        return answer %= 9;
    }
}
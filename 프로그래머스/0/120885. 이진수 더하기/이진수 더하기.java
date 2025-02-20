class Solution {
    public String solution(String bin1, String bin2) {

        int first = Integer.parseInt(bin1, 2);
        int second = Integer.parseInt(bin2, 2);
        int sum = first + second;
        
        String answer = Integer.toString(sum, 2);
        return answer;
    }
}
class Solution {
    public int solution(int num, int k) {
        String number = "" + num;
        String convert = "" + k;
        
        int answer = number.indexOf(convert);
        if (answer == -1) return -1;
        else return answer + 1;
    }
}
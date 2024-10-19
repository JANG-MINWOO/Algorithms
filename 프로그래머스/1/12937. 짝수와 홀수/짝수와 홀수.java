class Solution {
    public String solution(int num) {
        String answer = "";
        int numAbs = Math.abs(num);
        if((numAbs%2)==1){
            answer = "Odd";
        }else{
            answer = "Even";
        }
        
        return answer;
    }
}
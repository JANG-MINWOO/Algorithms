class Solution {
    public int[] solution(long n) {
        String s = ""+n; //빈 String에 n이 문자열로들어가게
        int[] answer = new int[s.length()];
        int i=0;
        while(n>0){
            answer[i]=(int)(n%10);
            n/=10;
            i++;
        }
        
        return answer;
    }
}